package ru.alex.tnQuest.xml.service.Impl;

import ru.alex.tnQuest.dto.UserDto;
import ru.alex.tnQuest.xml.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
