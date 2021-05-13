package com.board.dev.domain.user.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/board/dev/domain/user/entity/User;", "", "id", "", "password", "name", "role", "Lcom/board/dev/domain/user/entity/User$Role;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/board/dev/domain/user/entity/User$Role;)V", "getId", "()Ljava/lang/String;", "getName", "getPassword", "setPassword", "(Ljava/lang/String;)V", "getRole", "()Lcom/board/dev/domain/user/entity/User$Role;", "encryptPassword", "", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "Role", "dev"})
@javax.persistence.Entity(name = "users")
public final class User {
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Id()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private final com.board.dev.domain.user.entity.User.Role role = null;
    
    public final void encryptPassword(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.board.dev.domain.user.entity.User.Role getRole() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.board.dev.domain.user.entity.User.Role role) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/board/dev/domain/user/entity/User$Role;", "", "(Ljava/lang/String;I)V", "ROLE_MEMBER", "ROLE_EXPERT", "dev"})
    public static enum Role {
        /*public static final*/ ROLE_MEMBER /* = new ROLE_MEMBER() */,
        /*public static final*/ ROLE_EXPERT /* = new ROLE_EXPERT() */;
        
        Role() {
        }
    }
}