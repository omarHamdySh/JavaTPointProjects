package javatpoint19;

/**
 * The effect of the "strictfp" modifier is to make all float or double
 * expressions within the interface declaration also all methods declared in the
 * interface, and all nested types declared in the interface, are implicitly
 * "strictfp"
 *
 * Take into consideration that for methods, "strictfp" is applied on the
 * implementations inside this interface only (not even inherited methods), so
 * we can say it's applied on the default and static methods only.
 *
 *
 * Check the JLS for more details:
 * https://docs.oracle.com/javase/specs/jls/se9/html/jls-9.html#jls-9.1.1.2 <br>
 * also check this link: https://stackoverflow.com/a/31608299/3578711
 */
public strictfp interface Increasable {

    /**
     * You cannot declare strictfp and abstract in the same time, but you can
     * declare the overriding method as strictfp
     *
     * strictfp abstract void increase(); compile time error.
     */
    void increase();

    /**
     * implicitly "strictfp"
     */
    default void decrease() {

    }

    /**
     * implicitly "strictfp"
     */
    static void freeze() {

    }
}
