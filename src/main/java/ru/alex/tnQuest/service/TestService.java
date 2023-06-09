package ru.alex.tnQuest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alex.tnQuest.javaConfig.service.UserService;

@RequiredArgsConstructor
@Service
//@ImportResource("classpath:applicationContext.xml")
public class TestService {

    private final UserService userService;

}
