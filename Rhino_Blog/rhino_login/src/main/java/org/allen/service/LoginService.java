package org.allen.service;

import org.allen.entity.Response;
import org.allen.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    Response login(User user);
}
