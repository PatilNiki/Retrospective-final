package com.java.retrospective.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMessageEntity is a Querydsl query type for MessageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMessageEntity extends EntityPathBase<MessageEntity> {

    private static final long serialVersionUID = 930527823L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMessageEntity messageEntity = new QMessageEntity("messageEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath message = createString("message");

    public final QRetrospectiveEntity retrospective;

    public final QSwimlaneEntity swimlane;

    public final QUserEntity user;

    public QMessageEntity(String variable) {
        this(MessageEntity.class, forVariable(variable), INITS);
    }

    public QMessageEntity(Path<? extends MessageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMessageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMessageEntity(PathMetadata metadata, PathInits inits) {
        this(MessageEntity.class, metadata, inits);
    }

    public QMessageEntity(Class<? extends MessageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.retrospective = inits.isInitialized("retrospective") ? new QRetrospectiveEntity(forProperty("retrospective")) : null;
        this.swimlane = inits.isInitialized("swimlane") ? new QSwimlaneEntity(forProperty("swimlane"), inits.get("swimlane")) : null;
        this.user = inits.isInitialized("user") ? new QUserEntity(forProperty("user")) : null;
    }

}

