package firstpkg;

import secondpkg.AccessModifiers;

/**
 * A class to test access modifiers in a child class.
 */
public class AccessModifiersChild extends AccessModifiers {

    public AccessModifiersChild() {
        super(1, 2);
    }

    public void test() {
        System.out.println("AccessModifiersChild.test()");

        /**
         * super.privateDataMember = 1; compile time error <br>
         * super.defaultDataMember = 2; compile time error.
         */
        super.protectedDataMember = 3;
        super.publicDataMember = 4;

        /**
         * super.privateMethod(); compile time error <br>
         * super.defaultMethod(); compile time error.
         */
        super.protectedMethod();
        super.publicMethod();

        System.out.println();
    }
}
