package org.allen.handler;

import org.allen.entity.Response;
import org.allen.exception.BusinessMsgEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class WebGlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value=RuntimeException.class)
    public Response exceptionHandler(HttpServletResponse response, Exception exception){
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return new Response(BusinessMsgEnum.INTERNAL_SERVER_EXCEPTION.getCode(), BusinessMsgEnum.INTERNAL_SERVER_EXCEPTION.getMessage(),null);
    }

}
