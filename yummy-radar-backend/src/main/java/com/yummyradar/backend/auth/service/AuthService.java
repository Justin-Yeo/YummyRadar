package com.yummyradar.backend.auth.service;

import com.yummyradar.backend.auth.dto.*;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
