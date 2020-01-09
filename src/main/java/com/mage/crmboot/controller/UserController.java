package com.mage.crmboot.controller;

import com.mage.crmboot.pojo.User;
import com.mage.crmboot.service.UserService;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MethodType;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
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

    @RequestMapping(path = "path")
    public String testPath(){
        return "this is a path";
    }

    @RequestMapping(value = "value")
    public String testValue(){
        return "this is a value";
    }

    @RequestMapping(value = "method",method = RequestMethod.POST)
    public String testMethod(){
        return "this is get Method";
    }

    @RequestMapping(value = "params", params = "id=str")
    public String testParams(){
        return "this is params";
    }


    @RequestMapping(value = "headers", headers = "content-type!=application/*")
    public String testHeaders(@RequestHeader("content-type") String header){
        return header;
    }

    @RequestMapping(value = "produce", produces = "application/json")
    public String testProduce(){
        return "asdfasdf";
    }
    @RequestMapping(value = "pathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id",required = false) String id){
        return id;
    }
}
