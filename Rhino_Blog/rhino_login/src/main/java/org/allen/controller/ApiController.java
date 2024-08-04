package org.allen.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.allen.entity.Response;
import org.allen.exception.BusinessMsgEnum;
import org.allen.exception.CustomException;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/test-exception")
    public Response testException(){
        if (true) {
            throw new CustomException(BusinessMsgEnum.OK);
        }
        return new Response(200,"Success",null);
    }

    @GetMapping("/csrf-token")
    public CsrfToken csrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    }
}
