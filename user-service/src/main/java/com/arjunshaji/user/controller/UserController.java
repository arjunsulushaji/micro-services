package com.arjunshaji.user.controller;

import com.arjunshaji.user.entity.User;
import com.arjunshaji.user.model.ResponseTemplate;
import com.arjunshaji.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Object saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{deptCode}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("deptCode") String code){
        return userService.getUserWithDepartment(code);
    }
}
