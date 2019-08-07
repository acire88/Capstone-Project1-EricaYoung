package com.company.CapStone_Project_1.service;

import com.company.CapStone_Project_1.dao.CategoryRepository;
import com.company.CapStone_Project_1.dao.TaskRepository;
import com.company.CapStone_Project_1.dto.Category;
import com.company.CapStone_Project_1.dto.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class TaskService {
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private TaskRepository taskRepo;

    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }
    public List<Task>getTaskByUserFullName(String firstName, String lastName){
        return taskRepo.findByUserFirstNameAndUserLastName(firstName,lastName);
    }
    public List<Task>getTaskByCategory(String category){
        return taskRepo.findByCategoryCategory(category);
    }
    public Task addTask(Task task){
        return taskRepo.save(task);
    }
    public Category addCategory(Category category){
        return categoryRepo.save(category);
    }

}
