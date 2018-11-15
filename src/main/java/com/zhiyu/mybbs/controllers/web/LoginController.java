package com.zhiyu.mybbs.controllers.web;

import com.zhiyu.mybbs.backservices.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(name = "/login", method = {RequestMethod.GET})
    public String login() {
        return "login";
    }

    @RequestMapping(name = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public String loginPost(String email, String password) {
        return null;
    }
}
