package com.company.CapStone_Project_1.controller;

import com.company.CapStone_Project_1.dto.User;
import com.company.CapStone_Project_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value="/User")
public class UserController {
    @Autowired
    UserService uService;

    @PostMapping(value="/newUser")
    @ResponseStatus(HttpStatus.OK)
    private User createUser(@RequestBody User user){
        uService.addUser(user);
        return user;
    }
}
