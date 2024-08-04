package org.allen.controller;

import org.allen.entity.Response;
import org.allen.entity.User;
import org.allen.exception.BusinessMsgEnum;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
//    @Autowired
//    private LoginService loginService;

    @PostMapping("/userpwd")
    public Response login(@RequestBody User user) {
        return new Response(BusinessMsgEnum.OK.getCode(), BusinessMsgEnum.LOGIN_SUCCESS.getMessage(), null);
    }

    @PostMapping("/submit")
    public String handlePostRequest(@RequestBody User user) {
        // 处理请求数据
        return "Received data: ";
    }
}
