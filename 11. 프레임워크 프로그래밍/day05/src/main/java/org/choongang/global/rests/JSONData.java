package org.choongang.global.rests;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class JSONData {
    private HttpStatus status = HttpStatus.OK; // 응답 코드 (성공이 더 많을테니까 OK로 고정)
    private boolean success = true; // 성공 실패 여부 체크(성공이 더 많을테니까 true로 고정)
    private Object message; // 실패시 메세지 사용
    @NonNull // final 안쓰고 @NonNull 쓴 이유 : 값 교체 가능하게 하려고
    private Object data; // 성공시 데이터 전송
    // 필드명과 에러 메세지 등 map형태도 수용해야 해서 String이 아니라 Object로 정의

}
