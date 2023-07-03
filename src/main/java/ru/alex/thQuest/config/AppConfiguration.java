package ru.alex.thQuest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import ru.alex.thQuest.javaConfig.service.Impl.UserServiceImpl;
import ru.alex.thQuest.javaConfig.service.UserService;

@Configuration
@ImportResource("classpath:applicationContext.xml")
@ComponentScan("ru.alex.thQuest.annotation")
public class AppConfiguration {

    @Bean
    public UserService createUserServiceBean() {
        return new UserServiceImpl();
    }
}
