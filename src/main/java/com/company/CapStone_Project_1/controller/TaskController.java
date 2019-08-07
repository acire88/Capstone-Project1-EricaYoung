package com.company.CapStone_Project_1.controller;

import com.company.CapStone_Project_1.dto.Category;
import com.company.CapStone_Project_1.dto.Task;
import com.company.CapStone_Project_1.dto.User;
import com.company.CapStone_Project_1.service.TaskService;
import com.company.CapStone_Project_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/TaskBoard")

public class TaskController {
    @Autowired
    TaskService tService;
    @Autowired
    UserService uService;


    @GetMapping(value = "/Task")
    public List<Task> getAllTask() {
        return tService.getAllTask();
    }

    @GetMapping(value = "/category/{category}")
    public List<Task> getTaskByCategory(@PathVariable String category) {
        return tService.getTaskByCategory(category);
    }

    @GetMapping(value="/user/{user}")
    public List<Task> getTaskByUserFullName(@PathVariable String firstName, @PathVariable String lastName){
        return tService.getTaskByUserFullName(firstName, lastName);
    }
    @PostMapping(value="/addUser")
    @ResponseStatus(HttpStatus.OK)
    public User createUser(@RequestBody User user){
        this.uService.addUser(user);
        return user;
    }
    @PostMapping(value="/addTask")
    @ResponseStatus(HttpStatus.OK)
    public Task createTask(@RequestBody Task task){
        this.tService.addTask(task);
        return task;
    }

    @PostMapping(value="/addCategory")
    @ResponseStatus(HttpStatus.OK)
    public Category createCategory(@RequestBody Category category){
        this.tService.addCategory(category);
        return category; }

        

}
