package javatpoint25;

/**
 *
 * @author abdo_
 */
public class Human {

    int id;
    private int beda;
    static int staticCount;
    String name;

    public Human() {
        Arm a = new Arm();
        a.type = "muscly"; //private inner accessible
    }

    void identify() {
        System.out.println("Human.identify()");
    }

    static void fart() {
        System.out.println("Human.fart()");
    }

    /**
     * - Member inner classes are created inside a class directly (outside
     * methods or constructors), they can access all outer classes members
     * (variables and methods) implicitly (without creating an object of them)
     * even private members, also outer classes can access all of their inner
     * classes members but explicitly (through creating an object of them);
     * Outer classes become available for inner classes through a final field
     * (inside the inner class) created by the compiler referring to the object
     * of the container class
     *
     * - Member inner classes can be public, protected, default or private, they
     * also can be abstract or final
     *
     * - Member inner classes can be created only through an object of their
     * container, ex: (Human h = new Human(); Human.Arm ha = h.new Arm();) and
     * actually it sounds logical, how can it refer to the object of it's
     * container, if it's not created yet
     *
     * - Also "static" content are not allowed in member inner classes (not even
     * static initializers), while "static final" data members (constants) are
     * allowed, actually JVM deals with constants in a special way
     *
     * - We will go with nested classes inheritance in details in a different
     * project
     *
     * - When the compiler compile a member inner class, it generates a ".class"
     * file named using this pattern: "Outer"$"Inner" <br>
     * "Outer" -> outer class name <br>
     * "Inner" -> inner class name <br>
     * so for this example it generates Arm class file named as "Human&Arm"
     *
     * Member inner class:
     */
    class Arm {

        /**
         * compile time error:
         *
         * static int dataMember1;
         *
         * static void method1() {
         *
         * }
         *
         * While constants are allowed, but they have to be initialized during
         * declaration only.
         */
        static final int ELBOW = 1;
        private String type;
        String name;

        void hit() {
            System.out.println("Human.Arm.hit()");
        }

        int getId() {
            return id;
        }

        void seeAccessbility() {
            /**
             * Accessing local members normally
             */
            String str = ELBOW + type + name;
            /**
             * Accessing containers members should go normally, except if there
             * was a hiding field, then we have to access it formally, to do so
             * we follow this pattern: "OuterClass".this."field"
             *
             * like this:
             */
            str += Human.this.name + Human.this.id + id + beda;
            /**
             * static content can be accessed through the class directly (and I
             * believe we know that :D )
             */
            str += Human.staticCount + staticCount;

            /**
             * Accessing static and non static methods:
             */
            identify();
            fart();
        }
    }

    /**
     * Can be final:
     */
    protected final class Mouth {

    }

    /**
     * Can be abstract:
     */
    public abstract class Nose {

    }

    /**
     * Can be private:
     */
    private class Leg {

    }
}
