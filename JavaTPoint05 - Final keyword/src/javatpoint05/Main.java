package javatpoint05;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * If you created an object to be final, it doesn't mean you can't
         * change the inner data of it (which is not final), and that's because
         * you created a final reference to that object, so the reference itself
         * cannot change it's value to another reference (cannot refer to
         * another object). I hope you could understand that :D
         */
        final MyClass mc = new MyClass();
        /**
         * Look here we're changing the inner content of the object, and guess
         * what? it's changing normally.
         */
        mc.display();
        mc.x = 8;
        mc.y = 9;
        mc.display();

        /**
         * The next line gives a compile time error cannot assign value to a
         * final variable
         *
         * mc = new MyClass();
         *
         * And that's what "the reference itself cannot change it's value to
         * another reference(cannot refer to another object)" meant.
         */
    }

    static void finalParameter(final int num) {
        /**
         * Declaring a parameter as final, constrain the programmer not to
         * change the value of it through the body of the method, so this line
         * would give you a compile time error.
         *
         * num = 5;
         */
    }
}

class MyClass {

    int x = 5;
    int y = 6;

    void display() {
        System.out.println("x: " + x + "\ny: " + y);
    }

}
