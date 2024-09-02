package org.choongang.global.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
public class BoardData {
    @Id @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String title;
    @Lob
    private String content;
}
