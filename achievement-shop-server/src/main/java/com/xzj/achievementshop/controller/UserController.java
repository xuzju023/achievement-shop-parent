package com.xzj.achievementshop.controller;

import com.xzj.achievementshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 15:10 2019/2/26
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource(name="userServiceImpl")
    private UserService service;

    @RequestMapping(value = "test")
    @ResponseBody
    public String test(){
        System.out.println(service.getAll());
        return "ok";
    }
}
