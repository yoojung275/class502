package member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Builder @ToString
//@NoArgsConstructor(access = AccessLevel.PUBLIC)
// 기본 생성자를 꼭 써야 하는 경우 -> @NoArgsConstructor @AllArgsConstructor
@NoArgsConstructor @AllArgsConstructor
public class User2 {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
