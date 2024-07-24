package org.choongang.global;


import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

@Component
@RequiredArgsConstructor
public class Utils { // 빈의 이름 - utils

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    public String toUpper(String str) {
        return str.toUpperCase();
    }

    public Map<String, List<String>> getErrorMessages(Errors errors) {
        // FieldErrors

        Map<String, List<String>> messages =errors.getFieldErrors()
                .stream()
                .collect(Collectors.toMap(FieldError::getField, e -> getCodeMessages(e.getCodes())));

        // GlobalErrors
        List<String> gMessages = errors.getGlobalErrors()
                .stream()
                .flatMap(e -> getCodeMessages(e.getCodes()).stream()).toList();

        if (!gMessages.isEmpty()) {
            messages.put("global", gMessages); // 글로벌 에러
        }
        return messages;
    }

    public  List<String> getCodeMessages(String[] codes) {
        ResourceBundleMessageSource ms = (ResourceBundleMessageSource) messageSource;
        ms.setUseCodeAsDefaultMessage(false); // false면 메세지 코드가 없어서 그냥 코드가 나오게 하는거임

        List<String> messages = Arrays.stream(codes)
                .map(c -> {
                    try {
                       return ms.getMessage(c, null, request.getLocale());
                    } catch (Exception e) {
                    return "";
                    }
                })
                .filter(s-> !s.isBlank())
                .toList();

        ms.setUseCodeAsDefaultMessage(true); // 싱글톤이기 때문에 계속 false 상태로 유지되지 않게 하기 위해 true로 다시 바꿔주는거임
        return messages;

    }
}
