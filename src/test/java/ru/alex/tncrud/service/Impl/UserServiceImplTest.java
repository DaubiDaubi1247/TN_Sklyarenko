package ru.alex.tncrud.service.Impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.entity.User;
import ru.alex.tncrud.mapper.UserMapper;
import ru.alex.tncrud.repository.UserRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static ru.alex.tncrud.dataForTest.UserTestData.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @Spy
    PasswordEncoder passwordEncoder;

    @InjectMocks
    UserServiceImpl userService;

    @Spy
    UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    @Test
    @DisplayName("create user")
    void createUser_ShouldReturnUserAfterSave() {

        User savedUserEntity = userEntityTestData();

        when(userRepository.save(any(User.class))).thenReturn(savedUserEntity);

        UserDto savedUser = userService.createUser(userWithPasswordTestData());

        assertEquals(savedUser, userTestDataAfterSave());
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    @DisplayName("get user by id")
    void getUserById_ShouldReturnUserById() {
        User savedUserEntity = userEntityTestData();

        when(userRepository.findById(any(Integer.class))).thenReturn(Optional.of(savedUserEntity));

        UserDto userById = userService.getUserById(1);

        assertEquals(userById.getId(),1);
        verify(userRepository, times(1)).findById(any(Integer.class));
    }

    @Test
    void updateUserInfo() {
    }

    @Test
    void deleteUser() {
    }

}