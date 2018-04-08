package javaapplication01;

/**
 *
 * @author abdo_
 */
public class PassByValue {

    public static void main(String... args) {
        /**
         * Java is always pass by value, this means for the next example, the
         * compiler copied the value of "c" which is 0, and assigned a new value
         * to the value itself, which is meaningless, so "c" is never affected
         * by that.
         */
        int c = 0;
        System.out.println("'c' before 'increase(int)': " + c);
        increase(c);
        System.out.println("'c' after 'increase(int)': " + c);

        System.out.println();

        /**
         * As we said before, Java is always pass by value, but for object you
         * have to understand what happens, for the next example, the compiler
         * copied the value of "mc1" and passed it the method, but the point
         * here is that value of mc1 is a reference to the real object, so a
         * copy of the reference is still a reference to the object, so when it
         * changed a value inside that reference, it will affect the real object
         * of course.
         */
        MyClass mc1 = new MyClass();
        System.out.println("'mc1.a' before 'increase(MyClass)': " + mc1.a);
        increase(mc1);
        System.out.println("'mc1.a' after 'increase(MyClass)': " + mc1.a);
    }

    static void increase(int b) {
        b = 10;
    }

    static void increase(MyClass b) {
        b.a = 10;
    }
}

class MyClass {

    int a = 0;
}
