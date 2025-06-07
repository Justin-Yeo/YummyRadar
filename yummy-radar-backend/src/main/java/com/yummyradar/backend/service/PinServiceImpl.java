package com.yummyradar.backend.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.yummyradar.backend.entity.Pin;
import com.yummyradar.backend.dto.PinInputDto;
import com.yummyradar.backend.repository.PinRepository;

@Service
public class PinServiceImpl implements PinService {

    private final PinRepository pinRepository;

    public PinServiceImpl(PinRepository pinRepository) {
        this.pinRepository = pinRepository;
    }

    @Override
    public List<Pin> getAllPins() {
        return pinRepository.findAll();
    }

    @Override
    public Pin createPin(PinInputDto dto) {
        Pin pin = new Pin(dto.getName(), dto.getLatitude(), dto.getLongitude(), dto.getDescription());
        return pinRepository.save(pin);
    }
} 