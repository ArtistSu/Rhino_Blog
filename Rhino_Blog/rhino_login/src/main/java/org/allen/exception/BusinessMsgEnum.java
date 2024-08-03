package org.allen.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum BusinessMsgEnum {
    // Authentication Failed
    AUTHENTICATION_EXCEPTION(101,"[AUTHENTICATION_EXCEPTION] Login information is incorrect. Please check your username and password.",HttpStatus.FORBIDDEN),
    INTERNAL_SERVER_EXCEPTION(HttpStatus.INTERNAL_SERVER_ERROR.value(),"[INTERNAL_SERVER_EXCEPTION] Internal server exception",HttpStatus.INTERNAL_SERVER_ERROR);

    private int code;
    private String message;
    private HttpStatus httpStatus;

}
