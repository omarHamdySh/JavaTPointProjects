package javatpoint04;

/**
 *
 * @author abdo_
 */
public class Human {

    long id;
    String name;
    int age;

    
    public Human() {
        System.out.println("Human is created");
    }

    public Human(long id, String name, int age) {
        this();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * Overridden with covariant return type.
     */
    Object run() {
        System.out.println("Human is running");
        return "Object";
    }

    public void setId(long id) {
        this.id = id;
    }

}
