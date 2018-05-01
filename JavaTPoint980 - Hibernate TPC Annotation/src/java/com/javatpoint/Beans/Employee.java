/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.Beans;

import javax.persistence.*;

/**
 *
 * @author omarhamdy
 */
@Entity
@Table(name = "employee")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {

    /**
     * if we used @GeneratedValue(strategy=GenerationType.AUTO) it will raise
     * up: org.hibernate.MappingException: Cannot use identity column key
     * generation with mapping for: com.javatpoint.Beans.Employee Because the
     * following: The problem here is that you mix "table-per-class" inheritance
     * and GenerationType.Auto. Consider an identity column in MYSQL, It is
     * column based. In a "table-per-class" strategy you use one table per class
     * and each one has an ID. So if we defined the primary key column in the
     * database as auto increment, it expects the generation value of the @id in
     * hibernate is to be of the type assign, which means don't GenerationType
     * just assign the value that is given to you. so the GenerationType.Auto
     * could achieve this function, but it conflicts with table-per-class
     * inheritance type, the solution is to not indecate a GenerationType at all
     * which will leave it by default of the GenerationType assign.
     *
     */

    @Id
    private int id;

    private String name;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
