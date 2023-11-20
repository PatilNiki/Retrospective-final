package com.java.retrospective.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRetrospectiveEntity is a Querydsl query type for RetrospectiveEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRetrospectiveEntity extends EntityPathBase<RetrospectiveEntity> {

    private static final long serialVersionUID = -827622203L;

    public static final QRetrospectiveEntity retrospectiveEntity = new QRetrospectiveEntity("retrospectiveEntity");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<SwimlaneEntity, QSwimlaneEntity> swimlanes = this.<SwimlaneEntity, QSwimlaneEntity>createList("swimlanes", SwimlaneEntity.class, QSwimlaneEntity.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public QRetrospectiveEntity(String variable) {
        super(RetrospectiveEntity.class, forVariable(variable));
    }

    public QRetrospectiveEntity(Path<? extends RetrospectiveEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRetrospectiveEntity(PathMetadata metadata) {
        super(RetrospectiveEntity.class, metadata);
    }

}

