package javatpoint07;

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
         * Rules:
         *
         * - You must know that the compiler always checks for the most specific
         * method through parameters number and types compatibility in the
         * reference type only, and it finishes this by determining the 
         * meant method signature that should be maintained by the JVM at runtime,
         * later the JVM checks the real type for the given signature,
         * and choose the fitting one
         *
         * - Casting always changes the reference type (which determine the
         * compiler's readability of methods) but the object itself remains in
         * it's real type (rule: a real type can never be changed, it can be
         * parsed).
         */

        System.out.println("Test 1:");
        /**
         * Description is inside the method.
         */
        test1();

        System.out.println();
        System.out.println();

        System.out.println("Test 2:");
        /**
         * Description is inside the method.
         */
        test2();

        System.out.println();
        System.out.println();

        System.out.println("Test 3:");
        /**
         * Description is inside the method.
         */
        test3();
    }

    /**
     * This methods plays football
     */
    static void test1() {
        Top top = new Sub();
        Sub sub = new Sub();

        String str = "Something";
        Object obj = str;

        /**
         * As we said before, compiler firstly determine a signature and the JVM
         * has to maintain that signature, and for the first 2 calls, because
         * the compiler doesn't know but the reference type which is "Top", so
         * it can only see "method(Object)", so it determined that this is the
         * signature should be maintained, later the JVM created the real
         * object, and found the overriding method "method(Object)" in "Sub".
         */
        top.method(obj);
        top.method(str);
        /**
         * But for those 2 calls, the compiler can see that the reference type
         * "Sub" have two overloaded methods ("method(Object)",
         * "method(String)"), so according to the reference type of the data
         * passed in the parameter, it determines the signatures which should be
         * maintained. (I said reference type of the data, because here in the second
         * method parameter object's real type is "String")
         */
        sub.method(obj);
        sub.method(str);
    }

    static void test2() {
        Top2 top2 = new Sub2();
        Sub2 sub2 = new Sub2();

        
        /**
         * In the next object declaration we will clarify the concept
         * of the reference type and the real type, at both the compile and run time,
         * the next representation will make the three references have the same
         * real type.
         */
        IndexOutOfBoundsException IOOBEx = new IndexOutOfBoundsException();
        RuntimeException REx = IOOBEx;
        Exception Ex = REx;

        /**
         * As I said a hundred time till now, the compiler can only know the
         * reference type of an object, so for the first 3 calls (that are
         * referenced with "Top2", it can only see the methods in "Top2" which
         * is "method(Exception)", so the compiler determines the signature that
         * should be maintained by the JVM which is "method(Exception)", later
         * the JVM creates the object knowing it's real type which is "Sub2",
         * then it finds no better fitting method than the inherited
         * "method(Exception)".
         */
        top2.method(IOOBEx);
        top2.method(REx);
        top2.method(Ex);
        /**
         * While for the next 3 calls, the compiler recognizes that the
         * reference type of the object is "Sub2", so these three methods
         * "method(IndexOutOfBoundsException)", "method(RuntimeException)",
         * "method(Exception)"(inherited) are visible to the compiler, and from
         * the references types of the objects passed, it determines each
         * signature should be maintained, (know that all the three objects' real
         * types is "IndexOutOfBoundsException", but it's casted to different
         * references types).
         */
        sub2.method(IOOBEx);
        sub2.method(REx);
        sub2.method(Ex);
    }

    static void test3() {
        Sub3 t3 = new Sub3();
        /**
         * Description is inside the method.
         */
        t3.test();
    }

}
