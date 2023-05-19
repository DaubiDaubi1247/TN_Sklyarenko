package ru.alex.tncrud.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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
        @NotBlank(message = "email must be not null and not empty")
        private String email;

}