package com.company.CapStone_Project_1.service;

import com.company.CapStone_Project_1.dao.UserRepository;
import com.company.CapStone_Project_1.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserRepository userRepo;

    public User addUser(User user){
        return userRepo.save(user);

    }

}
