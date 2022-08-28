package com.kong;

import com.kong.rpc.annotation.InjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @InjectService
    private UserService userService;

    @GetMapping("/user")
    public CommonResult<User> getUser(@RequestParam("id")Long id){
        return userService.getUser(id);
    }
}
