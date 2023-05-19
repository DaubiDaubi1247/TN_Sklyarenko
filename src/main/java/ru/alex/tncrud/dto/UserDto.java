package ru.alex.tncrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@SuperBuilder
public class UserDto {
        private Integer id;

        @NotBlank(message = "firstName must be not null and not empty")
        private String firstName;

        @NotBlank(message = "lastName must be not null and not empty")
        private String lastName;

        @Email(message = "email must be match pattern")
        private String email;

}