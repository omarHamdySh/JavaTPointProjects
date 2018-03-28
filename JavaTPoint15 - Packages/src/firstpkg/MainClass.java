package firstpkg;

/**
 * Importing a class allows you use it as if it was created in the same
 * packages, with respect to (access modifiers of course).
 */
import secondpkg.MyClass1;



/**
 * This is called static import, it has a special affect than a normal import,
 * it facilitate us to use static members that are declared in the specified
 * class, to be used in the current class without even a reference, if the
 * current class has the same static member, it will be taken as duplication,
 * and it will lead to a compile time error, (know that static import doesn't
 * import the class itself, so you can't use the class).
 */
import static secondpkg.MyClass2.*;

public class MainClass {

    public static void main(String[] args) {
        /**
         * Creating an object of the imported class.
         */
        MyClass1 mc = new MyClass1();
        mc.testNormalMethod();

        /**
         * The static method that was created in "MyClass2", it's used here
         * without a reference because of the static import.
         */
        testStaticMethod();

        /**
         * The following line will fire a compile time error, because as we said
         * before, the static import doesn't import the class
         *
         * MyClass2 mc2 = new MyClass2();
         *
         * .
         */
        
    }
}
