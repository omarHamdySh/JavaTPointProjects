package javatpoint25;

import java.lang.reflect.Modifier;

/**
 * Maintain this order: <br>
 * 1- Human <br>
 * 2- Main.testMemberInnerClass() <br>
 * 3- Main.testAnonymousInnerClass() <br>
 * 4- Animal <br>
 * 5- House <br>
 * 6- Main.testStaticNestedClass() <br>
 *
 * Basically, there are two types of nested classes they are derived as follows:
 * <br>
 * - Non-static nested classes (Member inner class, Anonymous inner class, Local
 * inner class) <br>
 * - Static nested class.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testMemberInnerClass();

        System.out.println();

        testAnonymousInnerClass();

        System.out.println();

        testStaticNestedClass();
    }

    static void testMemberInnerClass() {
        Human h = new Human();
        Human.Arm a1 = h.new Arm();
        Human.Arm a2 = (new Human()).new Arm();

        /**
         * This is a proof that the member inner class's object refers to the
         * creator object:
         */
        h.id = 5;
        System.out.println("a1.getId(): " + a1.getId());
        System.out.println("a2.getId(): " + a2.getId());
        /**
         * Member inner classes container class can't be up casted
         * to its member inner classes, cannot be up-casted compile time error:
         *
         * Human hh = (new Human()).new Arm();
         */
    }

    /**
     * - Anonymous inner classes are created at instantiation, we use them to
     * override a method, or to add some special behavior, actually they are
     * just classes that extends or implement a specific class or interface.
     *
     * - When compiler compile an inner class, it generates a ".class" file
     * named using this pattern: "this"$"n" <br>
     * "this" -> the current class name <br>
     * "n" -> anonymous inner classes counter <br>
     * so for this example it generates a class file named like this "Main$1"
     */
    static void testAnonymousInnerClass() {
        Human h1 = new Human() {
            static final int CON = 10;

            @Override
            void identify() {
                System.out.println("Anonymous.identify()");
            }
        };
        Human h2 = new Human();

        h1.identify();
        h2.identify();
    }

    static void testStaticNestedClass() {
        /**
         * We can access static members, through the reference type directly:
         */
        House.getHousesBuilt(); //House's getHoursesBuilt()
        House.Counter.getHousesBuilt(); //Counter's getHoursesBuilt()

        System.out.println(House.Counter.b + " : " + House.Counter.C + " : " + House.Counter.D);
        /**
         * Creating an object through the reference directly
         */
        House.Counter hc = new House.Counter();

        hc.method1();
        hc.method2();
        House.Counter.method2();
        
        /*
        implementing Nested interface that declared inside a normal class
        */
        House.NestedInterface3 In;
        In = new House.NestedInterface3() {
            @Override
            public void create() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
    }
}
