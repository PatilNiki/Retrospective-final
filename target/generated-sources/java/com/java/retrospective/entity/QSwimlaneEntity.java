package com.java.retrospective.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSwimlaneEntity is a Querydsl query type for SwimlaneEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSwimlaneEntity extends EntityPathBase<SwimlaneEntity> {

    private static final long serialVersionUID = 7728786L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSwimlaneEntity swimlaneEntity = new QSwimlaneEntity("swimlaneEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QRetrospectiveEntity retrospective;

    public final StringPath title = createString("title");

    public QSwimlaneEntity(String variable) {
        this(SwimlaneEntity.class, forVariable(variable), INITS);
    }

    public QSwimlaneEntity(Path<? extends SwimlaneEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSwimlaneEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSwimlaneEntity(PathMetadata metadata, PathInits inits) {
        this(SwimlaneEntity.class, metadata, inits);
    }

    public QSwimlaneEntity(Class<? extends SwimlaneEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.retrospective = inits.isInitialized("retrospective") ? new QRetrospectiveEntity(forProperty("retrospective")) : null;
    }

}

