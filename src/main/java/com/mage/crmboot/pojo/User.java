package com.mage.crmboot.pojo;

import com.mage.crmboot.base.BaseVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseVo {
    private String id;
    private String userName;
    private String userPwd;
    private String trueName;
    private String phone;
    private String email;
}
