package com.company.CapStone_Project_1.ServiceTest;


import com.company.CapStone_Project_1.dao.CategoryRepository;
import com.company.CapStone_Project_1.dao.TaskRepository;
import com.company.CapStone_Project_1.dto.Category;
import com.company.CapStone_Project_1.dto.Task;
import com.company.CapStone_Project_1.service.TaskService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class TaskServiceTest {
    @Mock
    @Autowired
    TaskRepository taskRepoMock;
    @Autowired
    CategoryRepository categoryRepoMock;

    @InjectMocks
    TaskService taskService;


    Category category1;
    Category category2;


    Task task1;
    Task task2;
    Task task3;

    List<Task> taskList;


    @Before
    public void taskRepoWrapper() {

        category1 = new Category();
        category1.setCategory("Done");

        category2 = new Category();
        category2.setCategory("InProgress");

        task1 = new Task();
        task1.setTitle("Update Inventory");
        task1.setDescription("Implement new inventory into database");
        task1.setDueDate("06/01/19");
        task2.setCategory(category1);


        task2 = new Task();
        task2.setTitle("API Database");
        task2.setDescription("Review dev API repo and make any changes necessary.");
        task2.setDueDate("DUE: 8/03/2019");
        task2.setCategory(category1);

        task3 = new Task();
        task3.setTitle("Organize Home");
        task3.setDescription("Clean the entire home. Do forget to wash the clothes and mop the floors");
        task3.setDueDate("10/15/19");
        task2.setCategory(category2);


        taskList = Arrays.asList(task1, task2, task3);

    }
    @Test

    public void shouldGetAllTask() {
        List<Task> expectedList = Arrays.asList(task1, task2, task3);
        when(taskRepoMock.findAll()).thenReturn(taskList);
        assertEquals(expectedList, taskService.getAllTask());

    }
}
