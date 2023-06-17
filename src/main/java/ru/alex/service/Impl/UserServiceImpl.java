package ru.alex.service.Impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alex.entity.User;
import ru.alex.repository.UserRepository;
import ru.alex.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public List<String> getAllUserSurnames() {

        List<User> userList = userRepository.findAll();

        return userList.stream()
                .map(user -> user.getFullName().split(" ")[0])
                .toList();
    }
}
