package org.choongang.member.controllers;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestJoin {
    @NotBlank(message="이메일을 입력하세요.")
    @Email(message = "이메일 형식이 아닙니다.")
    private String email;
    @Size(min=8)
    @NotBlank
    private String password;
    @NotBlank
    private String confirmPassword;
    @NotBlank
    private String userName;
    @AssertTrue
    private boolean agree;
}
