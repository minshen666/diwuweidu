package com.diwuweidu.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.diwuweidu.Entity.Result;
import com.diwuweidu.Entity.po.User;

public interface UserService extends IService<User> {
    public Result check(User user);
}
