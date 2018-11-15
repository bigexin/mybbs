package com.zhiyu.mybbs.controllers.api;

import com.zhiyu.mybbs.backservices.entities.User;
import com.zhiyu.mybbs.backservices.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class ApiUserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    public User findById(int id) {
        return userService.queryByPk(1, null);
    }
}
