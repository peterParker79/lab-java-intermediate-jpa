package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="Billable_task")
@PrimaryKeyJoinColumn(name="task_id" ) //Esta columna es la clave primaria
// de la subclase, y además, apunta a la clave primaria de la superclase

public class BillableTask extends Task{
    @Column(name="")
    private int hourlyRate;


    public BillableTask() {
     //   super();
    }

    public BillableTask(int taskId, String dueDate, boolean status, int hourlyRate) {
        super(taskId, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
