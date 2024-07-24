package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Builder
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
//@Table(name = "CH_MEMBER")
/*
@Table(indexes = {
        @Index(name = "idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name = "uq_email_password", columnList = "email, password", unique = true)
}) */
public class Member extends BaseEntity {
    @Id @GeneratedValue
    private Long seq;
    @Column(length = 60, nullable = false, unique=true) //not null 제약조건(=필수항목), 고유값(중복x)
    private String email;
    @Column(length = 65, nullable = false)
    private String password;
    @Column(length = 40, nullable = false, name = "name") // db 테이블은 name으로 만들어짐
    private String userName;
    //@Lob
    @Transient //내부적으로 사용하는 용도(매핑무시-> db에 반영 x)
    private String introduction;
    @Enumerated(EnumType.STRING) //EnumType.ORDINAL -> ORDINAL이 기본값이지만 순서가 꼬이면 문제가 커지니 EnumType.STRING으로 해야 함
    @Column(length = 10)
    private Authority authority;


}
