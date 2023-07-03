package ru.alex.thQuest.bean;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class UserBean {

    private String name;
    private String password;
}
