package com.java.retrospective.mappers;

import com.java.retrospective.dto.message.MessageInDto;
import com.java.retrospective.dto.message.MessageOutDto;
import com.java.retrospective.dto.retrospeective.SimpleRetrospectiveOutDto;
import com.java.retrospective.dto.swimlane.SwimlaneOutDto;
import com.java.retrospective.dto.user.UserDto;
import com.java.retrospective.entity.MessageEntity;
import com.java.retrospective.entity.RetrospectiveEntity;
import com.java.retrospective.entity.SwimlaneEntity;
import com.java.retrospective.entity.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-11T12:12:35+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageEntity mapInDtoToEntity(MessageInDto messageInDto) {
        if ( messageInDto == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setMessage( messageInDto.getMessage() );

        return messageEntity;
    }

    @Override
    public MessageEntity mapOutDtoToEntity(MessageOutDto messageOutDto) {
        if ( messageOutDto == null ) {
            return null;
        }

        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setMessage( messageOutDto.getMessage() );
        messageEntity.setUser( userDtoToUserEntity( messageOutDto.getUser() ) );
        messageEntity.setRetrospective( simpleRetrospectiveOutDtoToRetrospectiveEntity( messageOutDto.getRetrospective() ) );
        messageEntity.setSwimlane( swimlaneOutDtoToSwimlaneEntity( messageOutDto.getSwimlane() ) );

        return messageEntity;
    }

    @Override
    public MessageInDto mapEntityToInDto(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        MessageInDto messageInDto = new MessageInDto();

        messageInDto.setMessage( messageEntity.getMessage() );

        return messageInDto;
    }

    @Override
    public MessageOutDto mapEntityToOutDto(MessageEntity messageEntity) {
        if ( messageEntity == null ) {
            return null;
        }

        MessageOutDto messageOutDto = new MessageOutDto();

        messageOutDto.setMessage( messageEntity.getMessage() );
        messageOutDto.setUser( userEntityToUserDto( messageEntity.getUser() ) );
        messageOutDto.setRetrospective( retrospectiveEntityToSimpleRetrospectiveOutDto( messageEntity.getRetrospective() ) );
        messageOutDto.setSwimlane( swimlaneEntityToSwimlaneOutDto( messageEntity.getSwimlane() ) );

        return messageOutDto;
    }

    protected UserEntity userDtoToUserEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername( userDto.getUsername() );
        userEntity.setPassword( userDto.getPassword() );

        return userEntity;
    }

    protected RetrospectiveEntity simpleRetrospectiveOutDtoToRetrospectiveEntity(SimpleRetrospectiveOutDto simpleRetrospectiveOutDto) {
        if ( simpleRetrospectiveOutDto == null ) {
            return null;
        }

        RetrospectiveEntity retrospectiveEntity = new RetrospectiveEntity();

        retrospectiveEntity.setId( simpleRetrospectiveOutDto.getId() );
        retrospectiveEntity.setTitle( simpleRetrospectiveOutDto.getTitle() );

        return retrospectiveEntity;
    }

    protected SwimlaneEntity swimlaneOutDtoToSwimlaneEntity(SwimlaneOutDto swimlaneOutDto) {
        if ( swimlaneOutDto == null ) {
            return null;
        }

        SwimlaneEntity swimlaneEntity = new SwimlaneEntity();

        swimlaneEntity.setTitle( swimlaneOutDto.getTitle() );
        swimlaneEntity.setRetrospective( simpleRetrospectiveOutDtoToRetrospectiveEntity( swimlaneOutDto.getRetrospective() ) );

        return swimlaneEntity;
    }

    protected UserDto userEntityToUserDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername( userEntity.getUsername() );
        userDto.setPassword( userEntity.getPassword() );

        return userDto;
    }

    protected SimpleRetrospectiveOutDto retrospectiveEntityToSimpleRetrospectiveOutDto(RetrospectiveEntity retrospectiveEntity) {
        if ( retrospectiveEntity == null ) {
            return null;
        }

        SimpleRetrospectiveOutDto simpleRetrospectiveOutDto = new SimpleRetrospectiveOutDto();

        simpleRetrospectiveOutDto.setId( retrospectiveEntity.getId() );
        simpleRetrospectiveOutDto.setTitle( retrospectiveEntity.getTitle() );

        return simpleRetrospectiveOutDto;
    }

    protected SwimlaneOutDto swimlaneEntityToSwimlaneOutDto(SwimlaneEntity swimlaneEntity) {
        if ( swimlaneEntity == null ) {
            return null;
        }

        SwimlaneOutDto swimlaneOutDto = new SwimlaneOutDto();

        swimlaneOutDto.setTitle( swimlaneEntity.getTitle() );
        swimlaneOutDto.setRetrospective( retrospectiveEntityToSimpleRetrospectiveOutDto( swimlaneEntity.getRetrospective() ) );

        return swimlaneOutDto;
    }
}
