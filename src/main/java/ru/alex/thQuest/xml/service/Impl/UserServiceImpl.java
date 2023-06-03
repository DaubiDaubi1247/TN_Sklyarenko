package ru.alex.thQuest.xml.service.Impl;

import ru.alex.thQuest.dto.UserDto;
import ru.alex.thQuest.xml.service.UserService;

public class UserServiceImpl implements UserService {

    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
