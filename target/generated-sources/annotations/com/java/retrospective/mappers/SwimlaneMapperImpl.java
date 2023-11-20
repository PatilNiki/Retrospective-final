package com.java.retrospective.mappers;

import com.java.retrospective.dto.retrospeective.SimpleRetrospectiveOutDto;
import com.java.retrospective.dto.swimlane.SwimlaneInDto;
import com.java.retrospective.dto.swimlane.SwimlaneOutDto;
import com.java.retrospective.entity.RetrospectiveEntity;
import com.java.retrospective.entity.SwimlaneEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-11T12:12:35+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class SwimlaneMapperImpl implements SwimlaneMapper {

    @Override
    public SwimlaneOutDto mapEntityToOutDto(SwimlaneEntity swimlaneEntity) {
        if ( swimlaneEntity == null ) {
            return null;
        }

        SwimlaneOutDto swimlaneOutDto = new SwimlaneOutDto();

        swimlaneOutDto.setTitle( swimlaneEntity.getTitle() );
        swimlaneOutDto.setRetrospective( retrospectiveEntityToSimpleRetrospectiveOutDto( swimlaneEntity.getRetrospective() ) );

        return swimlaneOutDto;
    }

    @Override
    public SwimlaneOutDto mapEntityToInDto(SwimlaneEntity swimlaneEntity) {
        if ( swimlaneEntity == null ) {
            return null;
        }

        SwimlaneOutDto swimlaneOutDto = new SwimlaneOutDto();

        swimlaneOutDto.setTitle( swimlaneEntity.getTitle() );
        swimlaneOutDto.setRetrospective( retrospectiveEntityToSimpleRetrospectiveOutDto( swimlaneEntity.getRetrospective() ) );

        return swimlaneOutDto;
    }

    @Override
    public SwimlaneEntity mapOutDtoToEntity(SwimlaneOutDto swimlaneOutDto) {
        if ( swimlaneOutDto == null ) {
            return null;
        }

        SwimlaneEntity swimlaneEntity = new SwimlaneEntity();

        swimlaneEntity.setTitle( swimlaneOutDto.getTitle() );
        swimlaneEntity.setRetrospective( simpleRetrospectiveOutDtoToRetrospectiveEntity( swimlaneOutDto.getRetrospective() ) );

        return swimlaneEntity;
    }

    @Override
    public SwimlaneEntity mapInDtoToEntity(SwimlaneInDto swimlaneInDto) {
        if ( swimlaneInDto == null ) {
            return null;
        }

        SwimlaneEntity swimlaneEntity = new SwimlaneEntity();

        swimlaneEntity.setTitle( swimlaneInDto.getTitle() );

        return swimlaneEntity;
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

    protected RetrospectiveEntity simpleRetrospectiveOutDtoToRetrospectiveEntity(SimpleRetrospectiveOutDto simpleRetrospectiveOutDto) {
        if ( simpleRetrospectiveOutDto == null ) {
            return null;
        }

        RetrospectiveEntity retrospectiveEntity = new RetrospectiveEntity();

        retrospectiveEntity.setId( simpleRetrospectiveOutDto.getId() );
        retrospectiveEntity.setTitle( simpleRetrospectiveOutDto.getTitle() );

        return retrospectiveEntity;
    }
}
