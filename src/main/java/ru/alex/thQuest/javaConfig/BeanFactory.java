package ru.alex.thQuest.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alex.thQuest.javaConfig.service.Impl.UserServiceImpl;
import ru.alex.thQuest.javaConfig.service.UserService;

@Configuration
public class BeanFactory {

    @Bean
    public UserService createUserServiceBean() {
        return new UserServiceImpl();
    }
}
