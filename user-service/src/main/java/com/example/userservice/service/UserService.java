package com.example.userservice.service;

import com.example.userservice.payload.request.RegisterRequest;

public interface UserService {

    void addUser(RegisterRequest request);
}
