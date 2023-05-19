package ru.alex.tncrud.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@SuperBuilder
public class UserWithPasswordDto extends UserDto {
    @NotBlank(message = "password must be not null and not empty")
    private String password;
}
