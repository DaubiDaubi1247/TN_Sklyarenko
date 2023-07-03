package ru.alex.thQuest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.alex.thQuest.bean")
@PropertySource("classpath:application.properties")
public class AppConfiguration {

}
