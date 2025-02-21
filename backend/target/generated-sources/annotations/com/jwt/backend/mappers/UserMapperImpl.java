package com.jwt.backend.mappers;

import com.jwt.backend.dtos.SignUpDto;
import com.jwt.backend.dtos.UserDto;
import com.jwt.backend.entites.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-19T21:04:02+0530",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.firstName( user.getFirstName() );
        userDto.id( user.getId() );
        userDto.lastName( user.getLastName() );
        userDto.login( user.getLogin() );

        return userDto.build();
    }

    @Override
    public User signUpToUser(SignUpDto signUpDto) {
        if ( signUpDto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.firstName( signUpDto.firstName() );
        user.lastName( signUpDto.lastName() );
        user.login( signUpDto.login() );

        return user.build();
    }
}
