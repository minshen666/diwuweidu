package com.diwuweidu.Controller;

import com.diwuweidu.Entity.Result;
import com.diwuweidu.Entity.po.User;
import com.diwuweidu.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/get")
    public Result get(){
           return Result.ok("HelloWord");
    }
   @GetMapping("/login")
    public Result login(@RequestParam("userName") String userName,@RequestParam("password") String password){
         User user=new User();
         user.setUserName(userName);
         user.setPassword(password);
          return userService.check(user);
   }
}
