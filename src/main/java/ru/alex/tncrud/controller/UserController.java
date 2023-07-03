package ru.alex.tncrud.controller;

import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.mapper.UserMapper;
import ru.alex.tncrud.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserWithPasswordDto user) {
        return userMapper.toDto(userService.createUser(user));
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserById(@PathVariable @Min(1) Integer userId) {
        return userMapper.toDto(userService.getUserById(userId));
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UserDto updateUserInfo(@PathVariable @Min(1) Integer userId,
                                                  @RequestBody UserWithPasswordDto user) {

        return userMapper.toDto(userService.updateUserInfo(userId, user));
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable @Min(1) Integer userId) {

        userService.deleteUser(userId);
    }


}
