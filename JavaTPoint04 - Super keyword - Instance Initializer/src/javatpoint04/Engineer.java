package javatpoint04;

/**
 * Testing super keyword.
 */
public class Engineer extends Human {

    /**
     * This is called hiding, we hide the parent's data member (age) with
     * another data member having the same name (age)
     *
     * Determining which data member is accessed depends on the REFERENCE TYPE
     * of the object.
     */
    int age;

    public Engineer() {
        System.out.println("Engineer is created");
    }

    public Engineer(long id, String name, int age) {
        /**
         * 3- Using "super()" to invoke a specific parent constructor (IT MUST
         * BE THE FIRST STATEMENT IN THE CONSTRUCTOR) (NOTE THAT "super()" is
         * added implicitly in each inheriting class to instantiate an instance
         * of the parent class, and what is happening hear is that we are
         * choosing a specific constructor to run).
         */
        super(id, name, age);
        /**
         * 1- Using "super." to refer to a parent data member
         *
         * NOTE: those next two variables are different and the reference type
         * (ONLY) of the instance will determine which one will be accessible,
         * check the main method Test 1.
         */
        super.age = age;
        this.age = age * 2;
        /**
         * 2- Using "super." to refer to a parent method.
         */
        super.setId(id);
        System.out.println("Engineer is created");
    }
}
