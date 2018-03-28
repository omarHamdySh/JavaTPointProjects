package secondpkg;

/**
 * A class to test access modifiers in the same package.
 */
public class TestingAccessModifiersSamePackage {

    public void test() {
        System.out.println("TestingAccessModifiersSamePackage.test()");

        AccessModifiers am = new AccessModifiers(0);
        /**
         * am.privateDataMember = 1; compile time error.
         */
        am.defaultDataMember = 2;
        am.protectedDataMember = 3;
        am.publicDataMember = 4;

        /**
         * am.privateMethod(); compile time error.
         */
        am.defaultMethod();
        am.protectedMethod();
        am.publicMethod();

        System.out.println();
    }
}
