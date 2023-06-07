package ru.alex.service.Impl;

import ru.alex.entity.User;
import ru.alex.repository.UserRepository;
import ru.alex.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<String> getAllUserSurnames() {

        List<User> userList = UserRepository.getAllUsers();

        return userList.stream()
                .map(user -> user.getFullName().split(" ")[0])
                .toList();
    }
}
