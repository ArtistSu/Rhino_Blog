package org.allen.controller;

import org.allen.entity.Response;
import org.allen.entity.User;
import org.allen.exception.BusinessMsgEnum;
import org.allen.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

//    @Autowired
//    private LoginService loginService;

    @PostMapping("/pwd")
    public Response login(@RequestBody User user) {
        return new Response(BusinessMsgEnum.OK.getCode(), BusinessMsgEnum.LOGIN_SUCCESS.getMessage(), null);
    }

}
