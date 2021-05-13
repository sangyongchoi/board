package com.board.dev.domain.post.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/board/dev/domain/post/repository/PostRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/board/dev/domain/post/entity/Post;", "", "findByWriterIdOrderByIdDesc", "Lorg/springframework/data/domain/Page;", "writerId", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "dev"})
public abstract interface PostRepository extends org.springframework.data.jpa.repository.JpaRepository<com.board.dev.domain.post.entity.Post, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.data.domain.Page<com.board.dev.domain.post.entity.Post> findByWriterIdOrderByIdDesc(@org.jetbrains.annotations.NotNull()
    java.lang.String writerId, @org.jetbrains.annotations.NotNull()
    org.springframework.data.domain.Pageable pageable);
}