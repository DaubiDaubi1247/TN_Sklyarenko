package ru.alex.thQuest.annotation.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.alex.thQuest.annotation.service.UserService;
import ru.alex.thQuest.dto.UserDto;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(UserDto userDto) {
        return new UserDto(userDto.getName(), userDto.getPassword());
    }
}
