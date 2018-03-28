package firstpkg;

/**
 * Because "DefaultClass"'s access modifier is default, it's not accessible
 * here, so this line will fire a compile time error
 *
 * import secondpkg.DefaultClass;
 *
 * .
 */
import secondpkg.AccessModifiers;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new AccessModifiers(1, 2, 3).test();
        new secondpkg.TestingAccessModifiersSamePackage().test();
        new AccessModifiersChild().test();
        new TestingAccessModifiersDifferentPackage().test();
    }

}
