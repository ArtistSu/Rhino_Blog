package org.allen.controller;

import org.allen.entity.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/test-exception")
    public Response testException(){
        if(true){
            throw new RuntimeException("Mock exception");
        }
        return new Response("200","Success",null);
    }
}
