package com.kong;

import com.kong.rpc.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService{

    private static  Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public CommonResult<User> getUser(Long id) {
        logger.info("现在是【1】号提供服务");
        User user = new User(1L,"XX",2,"www.aa.com");
        return CommonResult.success(user);
    }
}
