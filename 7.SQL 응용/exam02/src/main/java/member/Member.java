package member;

import lombok.*;

import java.time.LocalDateTime;
/*
@EqualsAndHashCode
@Getter @Setter @ToString
 */
@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE) //기본 생성자
@NoArgsConstructor// 모든 멤버 변수를 변수로 사용
@AllArgsConstructor
@RequiredArgsConstructor // 특정 변수만 변수로 사용 (=필수 멤버 변수를 생성자 매개변수로 추가)
public class Member {
    @NonNull
    private String userId;
    @NonNull
    private String userNm;
    private String email;
    @ToString.Exclude // 이 변수는 배제하여 출력
    private LocalDateTime regDt;
}
