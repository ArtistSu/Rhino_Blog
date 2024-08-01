package org.allen.service;

import org.allen.entity.ResponseResult;
import org.allen.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    ResponseResult login(User user);
}
