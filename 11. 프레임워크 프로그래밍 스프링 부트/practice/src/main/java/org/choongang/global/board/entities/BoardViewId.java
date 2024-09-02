package org.choongang.global.board.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Embeddable
@NoArgsConstructor @AllArgsConstructor
public class BoardViewId {
    private long seq;
    @Column(name = "_uid")
    private int uid;
}
