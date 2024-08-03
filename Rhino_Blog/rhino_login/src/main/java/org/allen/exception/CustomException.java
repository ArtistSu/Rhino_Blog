package org.allen.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends RuntimeException{

    private int code;
    private String message;
    private HttpStatus httpStatus;

    public CustomException(BusinessMsgEnum msgEnum){
        this.code = msgEnum.getCode();
        this.message = msgEnum.getMessage();
        this.httpStatus = msgEnum.getHttpStatus();
    }
}
