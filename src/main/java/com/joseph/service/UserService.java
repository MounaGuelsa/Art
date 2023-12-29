package com.joseph.service;

import com.joseph.entity.User;

public interface UserService {
    User authenticateUser(String email, String pwd);
}
