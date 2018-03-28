package javatpoint17;

/**
 *
 * @author abdo_
 */
public class Child extends Parent implements Shittable {

    /**
     * Overriding method should not be restrictive (weaker access modifier than
     * the overridden method) - in arabic el overriding mashy bmabda2
     * mats3'rneesh, so of course momkn tekabrny - a child mynf3sh yes3'r his
     * parent :D
     *
     * In the next method, we are overriding the method with the same access
     * modifier, no problem with that (know that "public" was acceptable too).
     */
    @Override
    protected void talk() {
        System.out.println("Child.talk()");
    }

    /**
     * We overridden a "default" method with "public", there is no problem with
     * that (know that "protected" and "default" are acceptable too).
     */
    @Override
    public void tell() {
        System.out.println("Child.tell()");
    }

    /**
     * The same goes with interfaces methods, but don't forget that interfaces
     * methods are "public" by default, and we cannot change that, so an
     * interface method cannot be overridden with less than "public" access
     * modifier.
     */
    @Override
    public void shit() {
        System.out.println("Child.shit()");
    }
}
