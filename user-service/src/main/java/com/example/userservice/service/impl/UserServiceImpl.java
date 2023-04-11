package com.example.userservice.service.impl;

import com.example.userdatamodel.entity.UserAccount;
import com.example.userservice.payload.request.RegisterRequest;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    @Override
    public void addUser(RegisterRequest request) {
        log.info("Saving new user {} to the database", request.getLName());
        userRepo.save(UserAccount.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .fName(request.getFName())
                .lName(request.getLName())
                .dob(request.getDob())
                .address(request.getAddress())
                .gender(request.getGender())
                .role("USER")
                .phoneNum(request.getPhoneNum())
                .build());
    }
}
