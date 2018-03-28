package javatpoint09;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * @param args the command line arguments Overriding
     */
    public static void main(String[] args) {
        /**
         * Testing abstract classes, how to deal with them and how to create an
         * object of them (anonymous inner class, explained in "Human" class (by
         * mistake :D)).
         */
        Human h = new Human() {
            @Override
            void talk() {
                System.out.println("Overriding talk while object creation using anonymous inner class");
            }
        };
        h.talk();

        Human he = new Engineer();
        he.talk();
    }
}
