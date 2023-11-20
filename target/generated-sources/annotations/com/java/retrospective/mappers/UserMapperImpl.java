package com.java.retrospective.mappers;

import com.java.retrospective.dto.user.UserDto;
import com.java.retrospective.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-11T12:12:35+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity mapDtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername( userDto.getUsername() );
        userEntity.setPassword( userDto.getPassword() );

        return userEntity;
    }

    @Override
    public UserDto mapEntityToDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername( userEntity.getUsername() );
        userDto.setPassword( userEntity.getPassword() );

        return userDto;
    }
}
