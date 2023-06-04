package ru.alex.thQuest.javaConfig.service.Impl;

import ru.alex.thQuest.dto.UserDto;
import ru.alex.thQuest.javaConfig.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
