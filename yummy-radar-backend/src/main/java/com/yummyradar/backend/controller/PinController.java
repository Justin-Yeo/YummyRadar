package com.yummyradar.backend.controller;

import com.yummyradar.backend.dto.PinInputDto;
import com.yummyradar.backend.dto.PinResponseDto;
import com.yummyradar.backend.entity.Pin;
import com.yummyradar.backend.service.PinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pins")
@CrossOrigin(origins = "${frontend.origin}")
public class PinController {

    private final PinService pinService;

    public PinController(PinService pinService) {
        this.pinService = pinService;
    }

    @GetMapping
    public ResponseEntity<List<PinResponseDto>> getAllPins() {
        List<Pin> pins = pinService.getAllPins();
        List<PinResponseDto> responseDtos = pins.stream()
                .map(PinResponseDto::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responseDtos);
    }

    @PostMapping
    public ResponseEntity<PinResponseDto> createPin(@Valid @RequestBody PinInputDto dto) {
        Pin saved = pinService.createPin(dto);
        PinResponseDto responseDto = new PinResponseDto(saved);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
} 