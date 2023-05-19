package ru.alex.tncrud.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
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