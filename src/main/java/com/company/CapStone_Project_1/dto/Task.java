package com.company.CapStone_Project_1.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.util.Objects;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="task")

public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String dueDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", updatable = false, insertable = false)
    private User user; //to add users to the post

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId", updatable = false, insertable = false)
    private Category category;

    public Task(){}
//    public Task(@NotNull Integer id,@NotNull String title, @NotNull String description, @NotNull String dueDate, @NotNull @Length(max = 40) String category) {
//        this.id = id;
//        this.title=title;
//        this.description = description;
//        this.dueDate = dueDate;
//        this.category = category;
//    }

    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public Category getCategory(){
        return this.category;
    }
    public void setCategory(Category category){
        this.category=category;
    }

    public User getUser(){return this.user;}
    public void setUser(User user){
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(title, task.title) &&
                Objects.equals(description, task.description) &&
                Objects.equals(dueDate, task.dueDate)&&
                Objects.equals(user, task.user) &&
                Objects.equals(category, task.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, dueDate,user, category);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", user=" + user +
                ", category=" + category +
                '}';
    }
}
