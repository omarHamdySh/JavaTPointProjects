package javatpoint19;

/**
 *
 * @author abdo_
 */
public class Engineer extends Human implements Increasable {

    /**
     * The effect of the strictfp modifier is to make all float or double
     * expressions within the method body be explicitly FP-strict.
     *
     * check this link:
     * https://docs.oracle.com/javase/specs/jls/se9/html/jls-8.html#jls-8.4.3.5
     */
    public strictfp void doSmth() {

    }

    @Override
    public void talk() {

    }

    /**
     * You can override "strictfp" method to be non-strictfp
     */
    @Override
    public void tell() {

    }

    /**
     * You can override a non strictfp method to be a strictfp method in this
     * context.
     */
    @Override
    public strictfp void increase() {

    }
    
}
