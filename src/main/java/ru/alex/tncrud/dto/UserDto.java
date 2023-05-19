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

        @NotBlank
        private String firstName;

        @NotBlank
        private String lastName;

        @Email
        private String email;

}