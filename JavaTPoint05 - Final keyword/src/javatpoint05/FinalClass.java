package javatpoint05;

/**
 * Final classes cannot be inherited, it's like you're telling the compiler,
 * this is the final class (no more children)
 *
 * But this doesn't mean it cannot inherit from other classes -> .
 */
public final class FinalClass extends FinalVariables {

    int dataMember1;

    void method1() {
        System.out.println("FinalClass.normalMethod()");
    }
}
