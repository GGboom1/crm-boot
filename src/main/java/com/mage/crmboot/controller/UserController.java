package com.mage.crmboot.controller;

import com.mage.crmboot.pojo.User;
import com.mage.crmboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping("list")
    public List<User> findAllUser(){
        List<User> userList = userService.findAllUser();
        return userList;
    }

    @RequestMapping("updatePwd")
    public ModelAndView updatePwd(User user, ModelAndView modelAndView){
        modelAndView.setViewName("index");
        userService.updatePwd(user, modelAndView);
        return modelAndView;
    }
}
