package ru.alex.tncrud.service;

import jakarta.validation.Valid;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;

public interface UserService {

    UserDto createUser(@Valid UserWithPasswordDto userDto);

    UserDto getUserById(Integer id);

    UserDto updateUserInfo(Integer id, @Valid UserWithPasswordDto newUserInfo);

    void deleteUser(Integer id);
}
