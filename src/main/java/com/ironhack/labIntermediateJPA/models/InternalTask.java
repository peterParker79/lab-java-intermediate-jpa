package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Task")
@PrimaryKeyJoinColumn(name="task_id" )
public class InternalTask extends Task{

    public InternalTask() {
    }
}

