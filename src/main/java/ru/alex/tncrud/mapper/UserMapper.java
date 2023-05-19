package ru.alex.tncrud.mapper;

import org.mapstruct.Mapper;
import ru.alex.tncrud.dto.UserDto;
import ru.alex.tncrud.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDto userDto);

    UserDto toDto(User user);
}
