package ru.alex.tncrud.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;
import ru.alex.tncrud.excetpion.AlreadyExistException;
import ru.alex.tncrud.mapper.UserMapper;
import ru.alex.tncrud.repository.UserRepository;
import ru.alex.tncrud.service.UserService;
import ru.alex.tncrud.utils.ExceptionTextFabric;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
@Validated
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(@Valid UserWithPasswordDto userDto) {

        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new AlreadyExistException(ExceptionTextFabric.emailAlreadyExist(userDto.getEmail()));
        }

        User newUser = userMapper.toEntity(userDto);
        newUser.setPassword(passwordEncoder.encode(userDto.getPassword()));

        return userMapper.toDto(userRepository.save(newUser));
    }
}
