package com.kong;

public interface UserService {
    CommonResult<User> getUser(Long id);
}
