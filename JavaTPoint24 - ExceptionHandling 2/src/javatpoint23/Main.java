package javatpoint23;

/**
 * Maintain this order ReturnInTry, Parent, Child, CustomExceptions.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testReturnInTry();

        System.out.println("");
        
        try {
            new CustomExceptions().validateAge(9);
        } catch (InvalidAgeException ex) {
            System.out.println(ex);
        }
        
        try {
            new CustomExceptions().validateName("3abdo");
        } catch (InvalidNameException ex) {
            System.out.println(ex);
        }
    }

    static void testReturnInTry() {
        System.out.println("tryCatchFinally1: " + new ReturnInTry().tryCatchFinally1());
        System.out.println("tryCatchFinally2: " + new ReturnInTry().tryCatchFinally2());
        System.out.println("tryCatchFinally3: " + new ReturnInTry().tryCatchFinally3());
        System.out.println("tryCatchFinally4: " + new ReturnInTry().tryCatchFinally4());
        System.out.println("tryCatchFinally5: " + new ReturnInTry().tryCatchFinally5());
    }
}
