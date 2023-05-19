package ru.alex.tncrud.service;

import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;

import javax.validation.Valid;

public interface UserService {

    UserDto createUser(@Valid UserWithPasswordDto userDto);

    UserDto getUserById(Integer id);
}
