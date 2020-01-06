package com.mage.crmboot.controller;

import com.mage.crmboot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping("")
    @ResponseBody
    public String index(User user){
        return "index";
    }
}
