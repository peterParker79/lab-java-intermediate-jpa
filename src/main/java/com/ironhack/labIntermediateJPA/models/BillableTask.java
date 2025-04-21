package com.ironhack.labIntermediateJPA.models;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="BillableTask")
@PrimaryKeyJoinColumn(name="task_id" ) //Esta columna es la clave primaria
// de la subclase, y además, apunta a la clave primaria de la superclase


public class BillableTask extends Task{

    public BillableTask() {
     //   super();
    }

}
