package javatpoint09;

/**
 * Extending an abstract class, will force you to override it's abstract
 * methods, it's a RULE ,,, or you can declare the class as abstract too (this
 * means, that the unimplemented methods will be implemented by a non-abstract
 * subclass, and maybe subclass of subclass, or subclass of subclass of
 * subclass, etc ... :D ).
 */
public class Engineer extends Human {

    float salary;

    /**
     * Overriding the unimplemented method to implement it.
     */
    @Override
    void talk() {
        System.out.println("I'm an Engineer");
    }
}
