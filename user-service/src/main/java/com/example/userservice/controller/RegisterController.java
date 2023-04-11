package com.example.userservice.controller;

import com.example.userservice.payload.request.RegisterRequest;
import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {

    private final UserService userService;

    @PostMapping
    ResponseEntity<String> addUser(
            @RequestBody @Valid RegisterRequest request
            ) {
        userService.addUser(request);
        return ResponseEntity.ok("Add user completed");
    }

}
