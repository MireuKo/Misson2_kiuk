package com.example.misson_kiuk.controller;

import com.example.misson_kiuk.jwt.JwtRequestDto;
import com.example.misson_kiuk.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("create")
    public void create(
            @RequestBody
            JwtRequestDto dto
    ){

    }
}
