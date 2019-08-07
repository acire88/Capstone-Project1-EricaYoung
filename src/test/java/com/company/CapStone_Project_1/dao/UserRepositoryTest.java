package com.company.CapStone_Project_1.dao;

import com.company.CapStone_Project_1.dto.Category;
import com.company.CapStone_Project_1.dto.Task;
import com.company.CapStone_Project_1.dto.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepo;
//    @Autowired
//    private TaskRepository taskRepo;
//    @Autowired
//    private CategoryRepository categoryRepo;

    //test objects
;

    User user1;
    User user2;

    @Before
    public void setUp(){

        user1 = new User();
        user1.setFirstName("Kim");
        user1.setLastName("Jackson");

        user2 = new User();
        user2.setFirstName("John");
        user2.setLastName("Smith");


    }
//add new user
    @Test
    @Transactional
    public void addUser(){
        userRepo.save(user1);
        userRepo.save(user2);

    }

}
