package ru.alex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alex.dataFabric.UserFabric;
import ru.alex.thQuest.dto.UserDto;
import ru.alex.thQuest.xml.service.UserService;

public class AppTest {

    @Test
    void testCreateBean_XmlConfig() {
        AbstractXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        UserDto userDto = UserFabric.getUserDto();

        UserService userService = applicationContext.getBean(UserService.class);
        Assertions.assertEquals(userDto, userService.createUser(userDto));
    }
}
