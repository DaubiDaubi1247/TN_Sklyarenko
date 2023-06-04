package ru.alex.tnQuest.annotation.service.Impl;

import org.springframework.stereotype.Component;
import ru.alex.tnQuest.annotation.service.UserService;
import ru.alex.tnQuest.dto.UserDto;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
