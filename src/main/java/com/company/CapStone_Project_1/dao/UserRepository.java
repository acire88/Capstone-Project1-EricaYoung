package com.company.CapStone_Project_1.dao;

import com.company.CapStone_Project_1.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{
    List<User>findByTask(String user);

}
