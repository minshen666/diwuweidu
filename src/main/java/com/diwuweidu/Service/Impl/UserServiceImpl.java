package com.diwuweidu.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.diwuweidu.Entity.Result;
import com.diwuweidu.Entity.po.User;
import com.diwuweidu.Mapper.UserMapper;
import com.diwuweidu.Service.UserService;
import com.diwuweidu.Utils.JWTUtils;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public Result check(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, user.getUserName()).eq(User::getPassword, user.getPassword());
        User one = getOne(queryWrapper);
        if(one==null){
            return Result.fail("该用户不存在");
        }
        String token = JWTUtils.getToken(one);
        return Result.ok(token);
    }
}
