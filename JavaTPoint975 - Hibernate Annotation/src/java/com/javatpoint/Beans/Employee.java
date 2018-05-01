/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.Beans;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @Entity annotation marks this class as an entity.
 * 
 */
@Entity
@Table(name="emp1000")

/**
 * @Table annotation specifies the table name where data of this entity is to be persisted.
 * If you don't use @Table annotation, hibernate will use the class name as the table name by default.
 */
public class Employee {

    @Id
    /**
     * @Id annotation marks the identifier for this entity.
     * 
     * @Column annotation specifies the details of the column for this property or field.
     * If @Column annotation is not specified, property name will be used as the column name by default.
     */
    private int id;
    private String first_name, last_name;

    
    public Employee() {
    }
   
    //@Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

}
