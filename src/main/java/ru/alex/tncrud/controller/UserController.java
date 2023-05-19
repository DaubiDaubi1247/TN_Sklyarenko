package ru.alex.tncrud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserWithPasswordDto user) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(userService.createUser(user));
    }

}
