package ru.alex.tnQuest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import ru.alex.tnQuest.dataFabric.UserFabric;
import ru.alex.tnQuest.dto.UserDto;
import ru.alex.tnQuest.xml.service.Impl.UserServiceImpl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AppTest {

    @Mock
    private UserServiceImpl userServiceXml;

    @Mock
    private ru.alex.tnQuest.annotation.service.Impl.UserServiceImpl userServiceAnnotation;

    @Mock
    private ru.alex.tnQuest.javaConfig.service.Impl.UserServiceImpl userServiceJavaConfig;

    @Test
    void testCreateBean_XmlConfig() {

        UserDto userDto = UserFabric.getUserDto();
        when(userServiceXml.createUser(any(UserDto.class))).thenReturn(new UserDto(userDto.getName(), userDto.getPassword()));

        Assertions.assertEquals(userDto, userServiceXml.createUser(userDto));
    }

    @Test
    void testCreateBean_AnnotationConfig() {

        UserDto userDto = UserFabric.getUserDto();
        when(userServiceAnnotation.createUser(any(UserDto.class))).thenReturn(new UserDto(userDto.getName(), userDto.getPassword()));

        Assertions.assertEquals(userDto, userServiceAnnotation.createUser(userDto));
    }

    @Test
    void testCreateBean_JavaConfig() {

        UserDto userDto = UserFabric.getUserDto();
        when(userServiceJavaConfig.createUser(any(UserDto.class))).thenReturn(new UserDto(userDto.getName(), userDto.getPassword()));

        Assertions.assertEquals(userDto, userServiceJavaConfig.createUser(userDto));
    }
}
