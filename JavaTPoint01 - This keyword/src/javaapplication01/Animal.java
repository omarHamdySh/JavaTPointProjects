package javaapplication01;

/**
 *
 * @author abdo_
 */
public class Animal {

    String type;
    String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void getOwned(Human owner) {
        /**
         * 4- Using "this" to refer to the current instance as a parameter.
         */
        owner.ownPet(this);
    }

    public Animal getPet() {
        /**
         * 5- Using "this" to refer to the current instance as a return.
         */
        return this;
    }

}
