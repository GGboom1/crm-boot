package com.mage.crmboot.service;

import com.mage.crmboot.mapper.UserMapper;
import com.mage.crmboot.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findAllUser() {
        List<User> userList = userMapper.findAllUser();
        return userList;
    }

    public void updatePwd(User user, ModelAndView modelAndView) {
        userMapper.updatePwd(user.getTrueName(), user.getUserPwd());
        modelAndView.addObject("trueName", user.getTrueName());
        modelAndView.addObject("userPwd", user.getUserPwd());
    }
}
