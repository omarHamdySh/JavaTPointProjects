package javatpoint05;

/**
 *
 * @author abdo_
 */
public class FinalVariables {

    /**
     * A final variable can and must be initialized in one of three places:
     * initializer block, constructor and itself.
     *
     * Final variable in itself:
     */
    final int finalVar1 = 10;
    final int finalVar2;
    final int finalVar3;

    /**
     * Final variable in initializer block:
     */
    {
        finalVar2 = 11;
    }

    /**
     * Static final variables (constants) can only be initialized in two places:
     * static initializer block and itself, and that's because static
     * initializer blocks belong to class area, so they initialize the static
     * final variables without the need of instantiating an object, which what
     * static means.
     *
     * Static final variable in itself:
     */
    final static int FINAL_STATIC_VAR1 = 2;
    final static int FINAL_STATIC_VAR2;

    /**
     * Static final variable in static initializer block:
     */
    static {
        FINAL_STATIC_VAR2 = 5;
        
    }

    public FinalVariables() {
        /**
         * Final variable in constructor:
         */
        
        finalVar3 = 12;

        /**
         * This line would give a compile time error.
         *
         * FINAL_STATIC_VAR2 = 5;
         */
    }
}
