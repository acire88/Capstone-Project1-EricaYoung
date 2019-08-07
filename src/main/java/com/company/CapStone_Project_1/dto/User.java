package com.company.CapStone_Project_1.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //@NotNull
//    @Length(max = 40)
    @JsonProperty
    private String firstName;
   // @NotNull
//    @Length(max = 40)
    @JsonProperty
    private String lastName;

    @OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Task> task;

//------------| Not sure if i need the constructor??? |-----------------------------------
    public User(){}
//    public User(Integer id, String name, String email){
//        this.id=id;
//        this.name=name;
//        this.email=email;
//    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    public Set<Task> getTask() {
        return task;
    }

    public void setTask(Set<Task> task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(task, user.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, task);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", task=" + task +
                '}';
    }
}



