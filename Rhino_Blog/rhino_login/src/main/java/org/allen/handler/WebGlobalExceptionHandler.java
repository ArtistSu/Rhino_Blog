package org.allen.handler;

import jakarta.servlet.http.HttpServletResponse;
import org.allen.entity.Response;
import org.allen.exception.BusinessMsgEnum;
import org.allen.exception.CustomException;
import org.junit.jupiter.api.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebGlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex) {
        return "[Exception]Error: " + ex.getMessage();
    }

    @ExceptionHandler(CustomException.class)
    public Response handleRuntimeException(CustomException ex) {
        return new Response(ex.getCode(),ex.getMessage(),null);
    }







}
