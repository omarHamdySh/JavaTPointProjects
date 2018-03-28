package javatpoint25;

/**
 *
 * @author abdo_
 */
public class Animal {

    int animalDataMember = 1;
    static int animalStaticDataMember = 2;
    private int animalPrivatedataMember = 3;

    void method1() {
        System.out.println("Animal.method1()");
    }

    static void staticMethod2() {
        System.out.println("Animal.staticMethod2()");
    }

    void method3() {
        System.out.println("Animal.method3()");
        int localVariable = 4;
        final int localFinalVariable = 5;
        int duplicated = 10000;

        /**
         * - Local inner classes are created inside a method or constructor,
         * they can access all outer classes members, while they cannot be
         * accessed outside their scope (that's why they're called local), and
         * to access a local inner class inside it's scoop, you have to create
         * an object of it
         *
         * - Also "static" content are not allowed in local inner classes (not
         * even static initializers), while "static final" data members
         * (constants) are allowed, but as we know in the previous sentence,
         * local inner classes are not accessible outside their scope, so their
         * constants
         *
         * - Local inner classes are just members in a method, so they cannot
         * take access modifier, we can't say "public class"; They also cannot
         * see the next local variables (local variables that are written after
         * the class), while they can see all outer class members
         *
         * - Local inner classes can be abstract or final, but of course not
         * both
         *
         * - We will go with nested classes inheritance in details in a
         * different project
         *
         * - When the compiler compile a local inner class, it creates a
         * ".class" file named using this pattern: "Outer"$"n""Inner" <br>
         * "Outer" -> outer class name <br>
         * "n" -> inner class counter (counter increases if class name got
         * duplicated only) <br>
         * "Inner" -> inner class name <br>
         * for this example, it generates LocalInner class file named as
         * "Animal$1LocalInner.class"
         */
        class LocalInner {

            final static int CONSTANT = 100000;
            private int dataMember = 6;
            int duplicated = 10000;
            void seeAccessiblity() {
                System.out.println("Animal.method3().LocalInner1.seeAccessiblity()");
                String str = "";
                str += animalDataMember + animalStaticDataMember + animalPrivatedataMember + Animal.this.animalPrivatedataMember;
                str += localVariable + localFinalVariable;
                str += LocalInner.CONSTANT + dataMember;
                /**
                 * if a local variable is duplicated inside the a local inner
                 * class, the method's Local variable is inaccessible.
                 */
                str += duplicated;

                method1();
                staticMethod2();
                method3();
                
            }
            
        }
        abstract class AbstractInner {

        }
   
        final class FinalInner {
            
        }
       

        
    }

}
