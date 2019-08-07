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

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private TaskRepository taskRepo;

    //UserRepository UserRepo;
    Category category1;
    Category category2;

    Task task1;
    Task task2;
    Task task3;

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

    }

    @Test
    public void shouldAddTaskToCategory(){
        categoryRepo.save(category1);
        taskRepo.save(task1);
        taskRepo.save(task2);

        categoryRepo.save(category2);
        taskRepo.save(task3);
    }



}
