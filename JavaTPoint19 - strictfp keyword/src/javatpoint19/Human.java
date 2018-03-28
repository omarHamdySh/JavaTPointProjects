package javatpoint19;

/**
 * The effect of the "strictfp" modifier is to make all float or double
 * expressions within the class (including variable initializers, instance
 * initializers, static initializers, and constructors) also all methods
 * declared in the class, and all nested types declared in the class, are
 * implicitly "strictfp"
 *
 * Take into consideration that for methods, "strictfp" is applied on the
 * implementations inside this class only (not even inherited methods), so
 * abstract methods (which are not implemented), are not considered as
 * "strictfp".
 *
 *
 * Check the JLS for more details:
 * https://docs.oracle.com/javase/specs/jls/se9/html/jls-8.html#jls-8.1.1.3 <br>
 * also check this link: https://stackoverflow.com/a/31608299/3578711
 */
public abstract strictfp class Human {

    int id;
    String name;
    int age;

    /**
     * The effect of the strictfp modifier is to make all float or double
     * expressions within the method body be explicitly FP-strict
     *
     * Actually there is no need to mention "strictfp" here, because the class
     * itself is strictfp, and this method is within the class, it's already
     * "strictfp".
     */
    strictfp void fart() {
        System.out.println("BOMB");
    }

    /**
     * implicitly "strictfp"
     */
    void tell() {

    }

    /**
     * You cannot declare method as "strictfp" and "abstract" in the same time,
     * because "strictfp" keyword is always applied on the inner implementation
     * of something, but here you're not implementing the method
     *
     *
     * strictfp abstract void talk(); compile time error.
     */
    abstract void talk();
}
