package ru.alex.tncrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@SuperBuilder
public class UserWithPasswordDto extends UserDto {
    @NotBlank
    private String password;
}
