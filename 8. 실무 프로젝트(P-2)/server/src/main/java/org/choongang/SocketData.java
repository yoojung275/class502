package org.choongang;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor // 매개변수 없는 기본생성자
@AllArgsConstructor //매개변수가 있는 생성자 (아래 매개변수들 초기화 가능)
public class SocketData {
    private String from; // 보내는 쪽
    private String to; // 받는 쪽
    private String message;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime regDt;

}
