package javatpoint06;

/**
 *
 * @author abdo_
 */
public class TestStaticBinding extends Parent {

    void run() {
        /**
         * /1/ The point here is that there is no need to know an object type
         * because for static, final and private (see the description it was cleared in "Main" class),
         * /2/ but for normal methods (original and inherited), they are dynamically binded
         * as if it called from another method within another class (check polymorphism 2 class 3),
         * or we could say that when we call a method of class within its body, the compiler implicitly adds
         * this keyword before the call of the method.
         * 
         * this keyword:
         * when an object is created from a class, and this keyword is used within the codes of it
         * the compiler uses the reference of this object to access the class member, so we could say
         * that this keyword exchanged with the hash code of the object we got here.
         */
        staticMethod();
        finalMethod();
        privateMethod();
        normalMethod();
        show();
    }

    static void staticMethod() {
        System.out.println("TestStaticBinding.staticMethod()");
    }

    final void finalMethod() {
        System.out.println("TestStaticBinding.finalMethod()");
    }

    private void privateMethod() {
        System.out.println("TestStaticBinding.privateMethod()");
    }

    /*
    the next method have the default access modifier.
    */
    void normalMethod() {
        System.out.println("TestStaticBinding.normalMethod()");
    }

    @Override
    void show() {
        System.out.println("TestStaticBinding.show()");
    }
}
