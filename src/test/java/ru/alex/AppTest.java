package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alex.dataFabric.UserFabric;
import ru.alex.thQuest.dto.UserDto;
import ru.alex.thQuest.xml.service.UserService;

public class AppTest {

    @Test
    void testCreateBean_XmlConfig() {
        var applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserDto userDto = UserFabric.getUserDto();

        UserService userService = applicationContext.getBean(UserService.class);
        Assertions.assertEquals(userDto, userService.createUser(userDto));
    }

    @Test
    void testCreateBean_AnnotationConfig() {
        var applicationContext = new AnnotationConfigApplicationContext("ru.alex.thQuest.annotation");

        var userService = applicationContext.getBean(ru.alex.thQuest.annotation.service.UserService.class);

        UserDto userDto = UserFabric.getUserDto();
        Assertions.assertEquals(userDto, userService.createUser(userDto));
    }
}
