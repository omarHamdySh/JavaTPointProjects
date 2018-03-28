package javatpoint25;

/**
 *
 * @author abdo_
 */
public class House {

    int num;
    String address;
    private static int housesBuilt;

    void build() {
        System.out.println("House.build()");
    }

    static void getHousesBuilt() {
        System.out.println("House.getHousesBuilt()");
    }

    /**
     * - Static nested classes are created inside a class directly, they can
     * access all static members of the outer class implicitly, while outer
     * class can access a static nested class members explicitly (by creating an
     * object of it), or just by the reference type for static nested class's
     * static members, and by the way, static nested classes can have static
     * members even static initializers, unlike Member and Local inner classes
     *
     * - Because static nested classes are static, they belong to the class
     * itself, they belong to the outer class, so when we create an object of a
     * static nested class, we have to access the static class constructor
     * through the outer class reference directly, like this: <br>
     * House.Counter hc = new House.Counter();
     *
     * - Static nested classes can be abstract or final, not both of course
     *
     * - We will go with nested classes inheritance in details in a different
     * project
     *
     * - When the compiler compile a static nested class, it generates a
     * ".class" file named using this pattern: "Outer"$"Nested" <br>
     * "Outer" -> outer class name <br>
     * "Nested" -> nested class name <br>
     * so for this example it generates Counter class file named as
     * "House&Counter"
     */
    static class Counter {

        int a = 0;
        static int b = 10;
        final static int C = 20;
        final static int D;

        static {
            D = 30;
        }

        void method1() {
            System.out.println("House.Counter.method1()");
        }

        static void method2() {
            System.out.println("House.Counter.method2()");
        }
        static void getHousesBuilt() {
            System.out.println("House.Counter.getHousesBuilt()");
        }

        void seeAccessibility() {
            String str = "";
            /**
             * Compile time error, cannot access non-static in a static context:
             * <br>
             * str += num; <br>
             * str += address; <br>
             *
             * build();
             */
            str += housesBuilt;

            getHousesBuilt();
            House.getHousesBuilt();
        }
    }

    static abstract class StaticAbstractNested {

        abstract void method1();
    }

    static final class StaticFinalNested {

    }

    /**
     * - An interface declared inside a class or inside an interface is called
     * nested interface, nested interfaces are declared static by default, they
     * are just like static nested classes except they have no implementations
     * and their data members are constants, they also cannot access but static
     * data members and static methods
     *
     * - Nested interfaces can be private, default, protected or public
     *
     * - When the compiler compile a nested interface, it generates a ".class"
     * file named using this pattern: "Outer"$"Nested" <br>
     * "Outer" -> outer class name <br>
     * "Nested" -> nested class name <br>
     * so for this example it generates Counter class file named as
     * "House&Buildable"
     */
    interface Buildable {
    }

    private interface NestedInterface1 {

    }

    protected interface NestedInterface2 {

    }

    public interface NestedInterface3 {

        public void create();
        default void doThings(){
            housesBuilt=2;
        }
    }
}
