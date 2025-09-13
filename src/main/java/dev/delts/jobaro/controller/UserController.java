package dev.delts.jobaro.controller;

import dev.delts.jobaro.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService service) {
        this.userService = service;
    }
}
