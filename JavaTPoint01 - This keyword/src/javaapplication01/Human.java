package javaapplication01;

/**
 *
 * @author abdo_
 */
public class Human {

    int id;
    String name;
    int age;

    public Human(int id, String name) {
        /**
         * 1- Using "this." to refer to the current instance variable.
         */
        this.id = id;
        this.name = name;
    }

    public Human(int id, String name, int age) {
        /**
         * 2- Using "this()" to reuse another constructor (MUST BE FIRST
         * STATEMENT IN A CONSTRUCTOR).
         */
        this(id, name);
        /**
         * 3- Using "this." to refer to the current instance method.
         */
        this.setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ownPet(Animal pet) {

    }
}
