package ru.alex.tncrud.service;

import jakarta.validation.Valid;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;

public interface UserService {

    User createUser(@Valid UserWithPasswordDto userDto);

    User getUserById(Integer id);

    User updateUserInfo(Integer id, @Valid UserWithPasswordDto newUserInfo);

    void deleteUser(Integer id);
}
