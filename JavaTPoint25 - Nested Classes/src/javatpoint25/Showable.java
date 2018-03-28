package javatpoint25;

/**
 *
 * @author abdo_
 */
public interface Showable {

    /**
     * Interface cannot have member inner classes, and that's because that
     * interface always adds "public final static" keywords to it's data members
     * and "public static" keywords to it's methods, and it deals with member
     * classes as it deal with methods, so it adds "public static" keywords to a
     * member class, which make it static nested class not a member class, also
     * they're public by default
     *
     * So in the next example, it's a static nested class:
     */
    class MemberOrStatic {

    }

    /**
     * As we said before, nested interfaces are static by default, and when
     * they're created within interfaces, it forces them to be public.
     */
    interface NestedInterface {

    }
}
