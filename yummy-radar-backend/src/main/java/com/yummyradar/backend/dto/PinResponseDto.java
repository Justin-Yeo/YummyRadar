package com.yummyradar.backend.dto;

import com.yummyradar.backend.entity.Pin;

public class PinResponseDto {

    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    private String description;

    public PinResponseDto(Pin pin) {
        this.id = pin.getId();
        this.name = pin.getName();
        this.latitude = pin.getLatitude();
        this.longitude = pin.getLongitude();
        this.description = pin.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
} 