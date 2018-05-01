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
@DiscriminatorValue(value="reg_emp")
public class Regular_Employee extends Employee {
    
    private float salary;
    private float bonus;

    public Regular_Employee() {
    }

    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
}
