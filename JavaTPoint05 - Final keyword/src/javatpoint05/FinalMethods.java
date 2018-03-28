package javatpoint05;

/**
 *
 * @author abdo_
 */
public class FinalMethods {

    int dataMember1;

    void normalMethod() {
        System.out.println("FinalMethods.normalMethod()");
    }

    /**
     * Final methods cannot be overridden, it's like you're telling the
     * compiler, this is the last version of this method.
     */
    final void finalMethod() {
        System.out.println("FinalMethods.finalMethod()");
    }
}
