package ru.alex.tnQuest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alex.tnQuest.xml.service.UserService;

@SpringBootApplication
@RequiredArgsConstructor
public class App {

    private final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
