package ru.alex.tnQuest.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alex.tnQuest.javaConfig.service.Impl.UserServiceImpl;
import ru.alex.tnQuest.javaConfig.service.UserService;

@Configuration
public class BeanFactory {

    @Bean
    public UserService createUserServiceBean() {
        return new UserServiceImpl();
    }
}
