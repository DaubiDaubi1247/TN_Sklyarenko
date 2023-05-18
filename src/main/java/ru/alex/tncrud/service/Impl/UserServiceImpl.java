package ru.alex.tncrud.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.service.UserService;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
@Validated
public class UserServiceImpl implements UserService {

    @Override
    public UserDto createUser(@Valid UserDto userDto) {
        return null;
    }
}
