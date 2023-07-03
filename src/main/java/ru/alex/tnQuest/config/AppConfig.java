package ru.alex.tnQuest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import ru.alex.tnQuest.javaConfig.service.Impl.UserServiceImpl;
import ru.alex.tnQuest.javaConfig.service.UserService;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {


    @Bean
    public UserService createUserServiceBean() {
        return new UserServiceImpl();
    }
}
