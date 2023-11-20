package com.java.retrospective.mappers;

import com.java.retrospective.dto.retrospeective.RetrospectiveInDto;
import com.java.retrospective.dto.retrospeective.RetrospectiveOutDto;
import com.java.retrospective.entity.RetrospectiveEntity;
import com.java.retrospective.entity.SwimlaneEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-11T12:12:35+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class RetrospectiveMapperImpl implements RetrospectiveMapper {

    @Override
    public RetrospectiveInDto mapEntityToInDto(RetrospectiveEntity retrospectiveEntity) {
        if ( retrospectiveEntity == null ) {
            return null;
        }

        RetrospectiveInDto retrospectiveInDto = new RetrospectiveInDto();

        retrospectiveInDto.setTitle( retrospectiveEntity.getTitle() );
        retrospectiveInDto.setDescription( retrospectiveEntity.getDescription() );

        return retrospectiveInDto;
    }

    @Override
    public RetrospectiveOutDto mapEntityToOutDto(RetrospectiveEntity retrospectiveEntity) {
        if ( retrospectiveEntity == null ) {
            return null;
        }

        RetrospectiveOutDto retrospectiveOutDto = new RetrospectiveOutDto();

        retrospectiveOutDto.setTitle( retrospectiveEntity.getTitle() );
        retrospectiveOutDto.setDescription( retrospectiveEntity.getDescription() );
        List<SwimlaneEntity> list = retrospectiveEntity.getSwimlanes();
        if ( list != null ) {
            retrospectiveOutDto.setSwimlanes( new ArrayList<SwimlaneEntity>( list ) );
        }

        return retrospectiveOutDto;
    }

    @Override
    public RetrospectiveEntity mapOutDtoToEntity(RetrospectiveOutDto retrospectiveOutDto) {
        if ( retrospectiveOutDto == null ) {
            return null;
        }

        RetrospectiveEntity retrospectiveEntity = new RetrospectiveEntity();

        retrospectiveEntity.setTitle( retrospectiveOutDto.getTitle() );
        retrospectiveEntity.setDescription( retrospectiveOutDto.getDescription() );
        List<SwimlaneEntity> list = retrospectiveOutDto.getSwimlanes();
        if ( list != null ) {
            retrospectiveEntity.setSwimlanes( new ArrayList<SwimlaneEntity>( list ) );
        }

        return retrospectiveEntity;
    }

    @Override
    public RetrospectiveEntity mapInDtoToEntity(RetrospectiveInDto retrospectiveInDto) {
        if ( retrospectiveInDto == null ) {
            return null;
        }

        RetrospectiveEntity retrospectiveEntity = new RetrospectiveEntity();

        retrospectiveEntity.setTitle( retrospectiveInDto.getTitle() );
        retrospectiveEntity.setDescription( retrospectiveInDto.getDescription() );

        return retrospectiveEntity;
    }
}
