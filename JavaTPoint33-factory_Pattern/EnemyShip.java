/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_Pattern;

/**
 *
 * @author omarhamdy
 */
public abstract class EnemyShip {
    
    private String name;
    private double amtDamage;

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public String getName() {
        return name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }
    
    public void followHeroShip()
    {
        System.out.println(getName()+" is following the hero");
    
    }
    
    public void displayEnemyShip()
    {
        System.out.println(getName()+" is on Screen");
        
    }
    
    public void shootEnemyShip()
    {
        System.out.println(getName()+" attacks and does "+ getAmtDamage());
    }
    
            
}
