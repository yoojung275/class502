package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.entities.Member;

@Builder
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long seq;

    @Column(nullable = false) //not null 제약조건
    private String subject;

    @ManyToOne(fetch = FetchType.LAZY) //one -> member //member_seq (외래키) == one쪽에 있는 엔티티명_기본키속성 -> 이 외래키는 BoardData에 있음
    @JoinColumn(name="mSeq")
    private Member member;

    @Lob
    private String content;

    //@ManyToMany
    //private List<HashTag> tags;

}
