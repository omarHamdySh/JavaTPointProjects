package javatpoint04;

/**
 *
 * @author Abd Elrahman Adel
 */
public class Employee extends Human {

    /**
     * 4- This is called "instance initializer block", it is used to assign
     * values or do operations by default in any constructor, because
     * "initializer blocks" are copied to all constructors implicitly after
     * "super()".
     */
    {
        System.out.println("1st Initializer Block");
    }

    public Employee() {
        /**
         * super();
         * 1st initializer block
         * 2nd initializer block.
         */
        System.out.println("Hello, an Employee was created\n");
    }

    /**
     * 5- "Instance initializer blocks" are copied to the constructor in the
     * order of which they appear.
     */
    {
        System.out.println("2nd Initializer Block");
    }

    /**
     * Covariant return type overriding method.
     */
    @Override
    Integer run() {
        System.out.println("An Employee is running");
        return 1;
    }
    
    void test() {
        System.out.println(super.run());
        System.out.println(this.run());
    }
}
