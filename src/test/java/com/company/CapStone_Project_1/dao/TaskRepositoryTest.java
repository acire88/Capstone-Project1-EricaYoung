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
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskRepositoryTest {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private TaskRepository taskRepo;
    @Autowired
    private CategoryRepository categoryRepo;

    //test objects

    Category category1;
    Category category2;


    Task task1;
    Task task2;
    Task task3;

    User user1;
    User user2;
    @Before
    public void setUp(){
        category1 = new Category();
        category1.setCategory("Done");

        category2 = new Category();
        category2.setCategory("InProgress");

        task1 = new Task();
        task1.setTitle("Update Inventory");
        task1.setDescription("Implement new inventory into database");
        task1.setDueDate("06/01/19");

        task2 = new Task();
        task2.setTitle("API Database");
        task2.setDescription("Review dev API repo and make any changes necessary.");
        task2.setDueDate("DUE: 8/03/2019");

        task3 = new Task();
        task3.setTitle("Organize Home");
        task3.setDescription("Clean the entire home. Do forget to wash the clothes and mop the floors");
        task3.setDueDate("10/15/19");

        user1 = new User();
        user1.setFirstName("Kim");
        user1.setLastName("Jackson");

        user2 = new User();
        user2.setFirstName("John");
        user2.setLastName("Smith");

    }
//    @Test
//    public void shouldPostUserTask(){
//        userRepo.save(user1);
//        taskRepo.save(task1);
//
//        assertNotNull(task1.getId());
//    }
    @Test
    @Transactional
    public void shouldAddTask(){

        taskRepo.save(task1);
        taskRepo.save(task2);
        assertNotNull(task1.getId());
        assertNotNull(task2.getId());


    }

}

