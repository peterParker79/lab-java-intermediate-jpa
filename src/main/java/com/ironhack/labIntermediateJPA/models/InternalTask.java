package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Task")
@PrimaryKeyJoinColumn(name="task_id" )
public class InternalTask extends Task{

    public InternalTask() {
    }

    public InternalTask(String title, String dueDate, boolean status) {
        super(title, dueDate, status);
    }



}

