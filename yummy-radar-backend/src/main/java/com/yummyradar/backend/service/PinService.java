package com.yummyradar.backend.service;

import java.util.List;
import com.yummyradar.backend.entity.Pin;
import com.yummyradar.backend.dto.PinInputDto;

public interface PinService {
    List<Pin> getAllPins();
    Pin createPin(PinInputDto dto);
} 