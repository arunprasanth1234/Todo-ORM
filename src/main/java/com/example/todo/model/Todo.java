/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here 

package com.example.todo.model;

import javax.persistence.*;

@Entity
@Table(name = "todolist")

public class Todo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "todo")
    private String todo;
    @Column(name = "status")
    private String status;

    @Column(name = "priority")
    private String priority;

    public Todo(int id, String todo, String status, String priority) {

        this.id = id;

        this.todo = todo;

        this.status = status;

        this.priority = priority;
    }

    public Todo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
