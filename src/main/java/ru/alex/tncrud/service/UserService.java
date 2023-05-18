package ru.alex.tncrud.service;

import ru.alex.tncrud.dto.UserDto;

import javax.validation.Valid;

public interface UserService {

    UserDto createUser(@Valid UserDto userDto);
}
