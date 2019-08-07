package com.company.CapStone_Project_1.dao;

import com.company.CapStone_Project_1.dto.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task>findByCategoryCategory(String category);
    List<Task>findByUserFirstNameAndUserLastName(String firstName, String lastName);

}
