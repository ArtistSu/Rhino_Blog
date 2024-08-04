package org.allen.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum BusinessMsgEnum {
    // Authentication Failed
    OK(HttpStatus.OK.value(),"[OK] Request successfully",HttpStatus.OK),
    AUTHENTICATION_EXCEPTION(101,"[AUTHENTICATION_EXCEPTION] Login information is incorrect. Please check your username and password.",HttpStatus.FORBIDDEN),
    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR.value(),"[INTERNAL_SERVER_EXCEPTION] Internal server exception",HttpStatus.INTERNAL_SERVER_ERROR),
    LOGIN_SUCCESS(102,"[LOGIN_SUCCESS] Login success",HttpStatus.OK);

    private int code;
    private String message;
    private HttpStatus httpStatus;

}
