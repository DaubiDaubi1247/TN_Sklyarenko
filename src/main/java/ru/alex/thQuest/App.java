package ru.alex.thQuest;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alex.thQuest.dto.UserDto;
import ru.alex.thQuest.xml.service.UserService;

public class App {
    public static void main(String[] args) {
        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserDto userDto = new UserDto("sasha", "123");

        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService.createUser(userDto).equals(userDto));
    }
}
