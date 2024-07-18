package org.choongang.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
//@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, HttpServletRequest request, HttpServletResponse response, Model model) {
        e.printStackTrace();
        log.info("advice에서 유입");

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; //500대 에러 코드
        if (e instanceof CommonException commonException) {
            //CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }

        ModelAndView mv = new ModelAndView(); // ModelAndView 사용시 응답코드를 상세히 설정 가능
        mv.setStatus(status);

        mv.setViewName("error/common");

        return mv;
    }
}
