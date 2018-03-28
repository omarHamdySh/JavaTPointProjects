package javatpoint26;

/**
 *
 * @author abdo_
 */
public class OuterA {

    /**
     * When you inherit a class, it's member inner classes and static nested
     * classes are dealt like a member or static fields and their access
     * modifiers control if they are gonna be inherited or not (which mean if
     * they were private they won't be inherited, and so on)
     *
     * A member inner class can extend any other class (except local inner
     * because they're local :D), but it can extend other member inner classes
     * (inside or outside it's container(outer)), static nested classes,
     * non-inner classes
     *
     * Extending an inner class is like extending a non-inner class, it has no
     * restrictions, but you have to know that cyclic inheritance is not allowed
     * in java, so an outer class cannot inherit his inners, whatever were they
     * were member or static
     *
     * Don't forget those two rules: <br>
     * 1- When you inherit a class, you must call a constructor of the parent
     * class inside the constructors of the child class (in normal cases
     * "super()" is added by default by the compiler) <br>
     * 2- A member inner class can only be accessed through an object of it's
     * container
     *
     * So when a member or static inner class inherits a member inner class
     * within the same container (same outer), the "super()" of the container
     * will be accessible in the children implicitly because they have the same container,
     * and if one of them is accessible the other will be,
     * see "MemberB"; But if you inherited a member inner class in another container,
     * the "super()" will not be accessible in the child class implicitly, 
     * so you have to call it explicitly,by creating an object (inside its constructor)
     * of the container calling the super through it, see "MemberD"; While if
     * you inherited a static inner class (inside or outside the container), you
     * won't have to do anything, because it is "static", the "super()" will be
     * accessible normally, see "MemberC" and "MemberE"; (Know that those rules
     * for inheritance are applied just when you are inheriting a nested class,
     * and if the child was a normal non-inner class it won't have the same rules
     * see "ClassOne" and "ClassTwo" classes in "MyClass" file)
     *
     * A member inner class can inherit a static inner class.
     */
    
     /**
     * Extending non-inner class:
     */
    class MemberA extends MyClass {

    }

    /**
     * Extending member inner class in the same container:
     */
    class MemberB extends MemberTest {

    }

    /**
     * Extending static nested class in the same container:
     */
    class MemberC extends StaticTest {

    }

    /**
     * Extending member inner class in a different container (super() is not
     * accessible implicitly, it has to be called explictly):
     */
    public class MemberD extends OuterB.MemberTest {

        public MemberD() {
            new OuterB().super();
        }
    }

    /**
     * Extending static nested class in a different container(super() is
     * accessible):
     */
    class MemberE extends OuterB.StaticTest {

    }

    /**
     * Extending the container:
     */
    class MemberF extends OuterA {

    }

    /**
     * To be inherited only, maf3ol behe :D
     */
    class MemberTest {

    }

    /**
     * When a static nested class inherits another class, it can access all it's
     * members (static and non-static)
     *
     * -It can inherit non-inner class, see "StaticA" <br>
     * -It can inherit a member inner class within the same container, see
     * "StaticB" <br>
     * -It can inherit a static nested class within the same container, see
     * "StaticC" <br>
     * -It can inherit a member inner class from another container, but don't
     * forget that we have to create an object from the container and call
     * "super()" Explictly, see "StaticD" <br>
     * -It can inherit a static nested class from another container, see
     * "StaticE" <br>
     * -It can inherit it's container, see "StaticF" <br>
     *
     * Extending a non-inner class:
     */
    static class StaticA extends MyClass {

    }

    /**
     * Extending member inner class in the same container:
     */
    static class StaticB extends MemberTest {

    }

    /**
     * Extending static nested class in the same container:
     */
    static class StaticC extends StaticTest {

    }

    /**
     * Extending member inner class in a different container (super() is not
     * accessible, calling it explictly):
     */
    static class StaticD extends OuterB.MemberTest {

        public StaticD() {
            new OuterB().super();
        }
    }

    /**
     * Extending static nested class in a different container(super() is
     * accessible):
     */
    static class StaticE extends OuterB.StaticTest {

    }

    /**
     * Extending the container:
     */
    static class StaticF extends OuterA {

    }

    /**
     * To be inherited only, maf3ol behe :D
     */
    static class StaticTest {

    }

    /**
     * For local inner classes it's simple, a local inner class can inherit any
     * other class with no restrictions (non-inner classes, member inner
     * classes, static nested classes), but when a local inner class extends
     * another local inner class, we have to remember, that local inner classes
     * are local, they are not seen until they are declared, so if a local inner
     * class tried to extend a following local inner class, you'll get a compile
     * time error: cannot find symbol
     */
    void localInnerClass() {
        /**
         * If you tied: <br>
         * "class LocalA extends LocalC" <br>
         * you'll get a compile time error
         */
        class LocalA {
        }
        class LocalB extends LocalA {
        }
        class LocalC {
        }
    }
}
