package com.yummyradar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yummyradar.backend.entity.Pin;

public interface PinRepository extends JpaRepository<Pin, Long> {
} 