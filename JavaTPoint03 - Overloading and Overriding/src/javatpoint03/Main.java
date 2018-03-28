package javatpoint03;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.identify();
        h1.fart();
        h1.shout();
        Human.shout();

        System.out.println("");

        Engineer e1 = new Engineer();
        e1.identify();
        e1.fart();
        e1.shout();
        Engineer.shout();

        System.out.println("");

        Stupid s1 = new Stupid();
        s1.identify();
        s1.fart();
        s1.shout();
        Stupid.shout();

        /**
         * If there are no matching type arguments in the method, and each
         * method promotes similar number of arguments, there will be ambiguity
         *
         * - Review this stack overflow quest:
         * https://stackoverflow.com/questions/48178964/theoretical-inquiry-about-overloading-and-type-promotion-in-java
         *
         * - You also must read this part "15.12.2 Compile-Time Step 2: Determine
         * Method Signature" in the JLS:
         * https://docs.oracle.com/javase/specs/jls/se9/html/jls-15.html#jls-15.12.2
         *
         * - Also check this link:
         * https://www.javatpoint.com/method-overloading-in-java
         *
         * so this line will fire a compile time error:
         *
         * System.out.println(sub(20, 20));
         *
         * .
         */
        sum(2, 2);
        sum(2.3f, 2.3f);
        sum(2, 2, 2);

        byte a = 10;
        byte b = 10;

        System.out.println(add(a, b));
    }

    /**
     * byte : byte byte : short
     */
    /**
     * Overloading.
     */
    static long add(byte num1, short num2) {
        return 0;
    }

    static long add(short num1, short num2) {
        return 1;
    }

    /**
     * Overloading.
     */
    static long sub(int num1, long num2) {
        return 0;
    }

    static long sub(long num1, int num2) {
        return 1;
    }

    /**
     * Overloading.
     */
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    static float sum(float num1, float num2) {
        return num1 + num2;
    }

    static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
