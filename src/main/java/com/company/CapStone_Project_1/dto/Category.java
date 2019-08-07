package com.company.CapStone_Project_1.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="category")
public class Category{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Length(max=40)
    private String category;
    @OneToMany(mappedBy="category", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Task> task;




//    public Task(){}
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
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public Set<Task> getTask(){
        return this.task;
    }
    public void setTask(Set<Task> task){
        this.task=task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category1 = (Category) o;
        return Objects.equals(id, category1.id) &&
                Objects.equals(category, category1.category) &&
                Objects.equals(task, category1.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, task);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", task=" + task +
                '}';
    }

    public void addCategory(Category category) {

    }
}
