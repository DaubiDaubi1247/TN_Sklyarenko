package ru.alex.tncrud.service.Impl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.alex.tncrud.dto.UserWithPasswordDto;
import ru.alex.tncrud.entity.User;
import ru.alex.tncrud.excetpion.AlreadyExistException;
import ru.alex.tncrud.excetpion.NotFoundException;
import ru.alex.tncrud.mapper.UserMapper;
import ru.alex.tncrud.repository.UserRepository;
import ru.alex.tncrud.service.UserService;
import ru.alex.tncrud.utils.ExceptionTextFabric;


@Service
@RequiredArgsConstructor
@Validated
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User createUser(@Valid UserWithPasswordDto userDto) {

        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new AlreadyExistException(ExceptionTextFabric.emailAlreadyExist(userDto.getEmail()));
        }

        User newUser = userMapper.toEntity(userDto);
        newUser.setPassword(passwordEncoder.encode(userDto.getPassword()));

        return userRepository.save(newUser);
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(ExceptionTextFabric.entityNotFoundById(id)));
    }

    @Override
    @Transactional
    public User updateUserInfo(Integer id, @Valid UserWithPasswordDto newUserInfo) {
        User oldUserInfo = getUserById(id);

        oldUserInfo.setPassword(passwordEncoder.encode(newUserInfo.getPassword()));
        oldUserInfo.setEmail(newUserInfo.getEmail());
        oldUserInfo.setFirstName(newUserInfo.getFirstName());
        oldUserInfo.setLastName(newUserInfo.getLastName());

        return userRepository.save(oldUserInfo);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {

        userRepository.deleteById(id);
    }

}
