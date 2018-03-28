package firstpkg;

import secondpkg.AccessModifiers;

/**
 * A class to test access modifiers in a different package.
 */
public class TestingAccessModifiersDifferentPackage {

    public void test() {
        System.out.println("TestingAccessModifiersDifferentPackage.test()");

        AccessModifiers am = new AccessModifiers(0, 0, 0);
        /**
         * am.privateDataMember = 1; compile time error <br>
         * am.defaultDataMember = 2; compile time error <br>
         * am.protectedDataMember = 3; compile time error.
         */
        am.publicDataMember = 4;

        /**
         * am.privateMethod(); compile time error <br>
         * am.defaultMethod(); compile time error <br>
         * am.protectedMethod(); compile time error.
         */
        am.publicMethod();

        System.out.println();
    }
}
