package com.example.service;

import com.example.entity.User;

public interface UserPredicate {
    boolean judgeUser(User user);
}
