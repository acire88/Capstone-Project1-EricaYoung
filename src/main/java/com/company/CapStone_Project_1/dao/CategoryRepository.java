package com.company.CapStone_Project_1.dao;

import com.company.CapStone_Project_1.dto.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer > {
    List<Category> findByCategory(String category);
}
