package ru.alex.tnQuest.javaConfig.service.Impl;

import ru.alex.tnQuest.dto.UserDto;
import ru.alex.tnQuest.javaConfig.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
