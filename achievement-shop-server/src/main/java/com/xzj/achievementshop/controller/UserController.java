package com.xzj.achievementshop.controller;

import com.alibaba.fastjson.JSON;
import com.xzj.achievementshop.model.User;
import com.xzj.achievementshop.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "test",method = RequestMethod.POST)
    @ResponseBody
    public String test(User user){
        if(service.queryByUserName(user.getUserName())!=null){
            return "{\"result\":\"true\"}";
        }else{
            return "{\"result\":\"false\"}";
        }
    }
}
