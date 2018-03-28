package secondpkg;

/**
 * This will be our test case.
 */
public class AccessModifiers {

    //<editor-fold defaultstate="collapsed" desc="Data Members">
    /**
     * private data members and methods cannot be accessed outside the class.
     */
    private int privateDataMember;
    /**
     * default data members and methods cannot be accessed outside it's package.
     */
    int defaultDataMember;
    /**
     * protected data members and methods can be accessed inside the package
     * freely, and outside the package through inheritance.
     */
    protected int protectedDataMember;

    /**
     * public data members and methods can be accessed everywhere, inside the
     * package and outside it.
     */
    public int publicDataMember;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * private constructors cannot be used to instantiate objects outside the
     * class.
     */
    private AccessModifiers() {
        System.out.println("AccessModifiers.(Private Constructor)");
    }

    /**
     * default(access modifier) constructors cannot be used to instantiate
     * objects outside the package.
     */
    AccessModifiers(int i1) {
        System.out.println("AccessModifiers.(Default(access modifier) Constructor)");
    }

    /**
     * protected constructors can be used to instantiate objects inside the
     * package, and can be accessed in it's class children (inheritance).
     */
    protected AccessModifiers(int i1, int i2) {
        System.out.println("AccessModifiers.(Protected Constructor)");
    }

    /**
     * public constructors can be used to instantiate objects everywhere, inside
     * the package and outside it.
     */
    public AccessModifiers(int i1, int i2, int i3) {
        System.out.println("AccessModifiers.(Public Constructor)");
    }

    /**
     * A testing constructor.
     */
    AccessModifiers(String t1) {
        this();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * private data members and methods cannot be accessed outside the class.
     */
    private void privateMethod() {
        System.out.println("AccessModifiers.privateMethod()");
    }

    /**
     * default data members and methods cannot be accessed outside it's package.
     */
    void defaultMethod() {
        System.out.println("AccessModifiers.defaultMethod()");
    }

    /**
     * protected data members and methods can be accessed inside the package
     * freely, and outside the package through inheritance.
     */
    protected void protectedMethod() {
        System.out.println("AccessModifiers.protectedMethod()");
    }

    /**
     * public data members and methods can be accessed everywhere, inside the
     * package and outside it.
     */
    public void publicMethod() {
        System.out.println("AccessModifiers.publicMethod()");
    }
    //</editor-fold>

    /**
     * A Testing method.
     */
    public void test() {
        System.out.println("AccessModifiers.test()");

        privateDataMember = 1;
        defaultDataMember = 2;
        protectedDataMember = 3;
        publicDataMember = 4;

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();

        System.out.println();
    }
}
