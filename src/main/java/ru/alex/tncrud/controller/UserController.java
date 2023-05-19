package ru.alex.tncrud.controller;

import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable @Min(1) Integer userId) {
        return ResponseEntity.ok(userService.getUserById(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUserInfo(@PathVariable @Min(1) Integer userId,
                                                  @RequestBody UserWithPasswordDto user) {

        return ResponseEntity.ok(userService.updateUserInfo(userId, user));
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable @Min(1) Integer userId) {

        userService.deleteUser(userId);

        return new ResponseEntity<>(HttpStatus.OK);
    }


}