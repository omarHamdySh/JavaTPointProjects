/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint31.strategy.pattern;


/**
 *
 * @author omarhamdy
 */
public class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;
    
    public Fly flyingType;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getFavFood() {
        return favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public String getSound() {
        return sound;
    }
    
    public String tryToFly()
    {
    
    return flyingType.fly();
    
    }
    
    public void setFlyAbility(Fly newFlyingType)
    {
    flyingType= newFlyingType;
    
    }
    
}
