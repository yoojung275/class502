package org.choongang.global.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Map;

public class BadRequestException extends CommonException{
    // 일반 에러 메세지
    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST); //400 응답 코드
    }

    public BadRequestException(Map<String, List<String>> errorMessages) {
        // 커맨드 객체 검증 시에 나오는 에러 메세지
        super(null, HttpStatus.BAD_REQUEST);
        setErrorMessages(errorMessages);
    }
}
