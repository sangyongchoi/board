package com.board.dev.domain.post.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPost_Companion_Contents is a Querydsl query type for Contents
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QPost_Companion_Contents extends BeanPath<Post.Companion.Contents> {

    private static final long serialVersionUID = -2104359023L;

    public static final QPost_Companion_Contents contents = new QPost_Companion_Contents("contents");

    public final DateTimePath<java.time.LocalDateTime> endDate = createDateTime("endDate", java.time.LocalDateTime.class);

    public final NumberPath<Integer> homeSize = createNumber("homeSize", Integer.class);

    public final StringPath requirements = createString("requirements");

    public final DateTimePath<java.time.LocalDateTime> startDate = createDateTime("startDate", java.time.LocalDateTime.class);

    public QPost_Companion_Contents(String variable) {
        super(Post.Companion.Contents.class, forVariable(variable));
    }

    public QPost_Companion_Contents(Path<Post.Companion.Contents> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPost_Companion_Contents(PathMetadata metadata) {
        super(Post.Companion.Contents.class, metadata);
    }

}

