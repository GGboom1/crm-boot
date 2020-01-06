package com.mage.crmboot.mapper;

import com.mage.crmboot.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM t_user")
    List<User> findAllUser();

    @Update("UPDATE t_user SET true_name=#{trueName}, user_pwd=#{userPwd} WHERE user_name = 'nn'")
    Integer updatePwd(String trueName, String userPwd);
}
