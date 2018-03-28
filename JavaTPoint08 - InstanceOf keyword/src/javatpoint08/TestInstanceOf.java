package javatpoint08;

/**
 *
 * @author abdo_
 */
public class TestInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * testing "instanceof" keyword.
         */
        Human h = new Human();

        if (h instanceof Human) {
            System.out.println("h is Human");
        }
        if (h instanceof Developer) {
            System.out.println("h is Developer");
        } else {
            System.out.println("h isn't Developer");
        }

        System.out.println();

        Developer d = new Developer();
        if (d instanceof Human) {
            System.out.println("d is Human");
        }
        if (d instanceof Developer) {
            System.out.println("d is Developer");
        }

        System.out.println();

        Human hd = new Developer();
        if (hd instanceof Human) {
            System.out.println("hd is Human");
        }
        if (hd instanceof Developer) {
            System.out.println("hd is Developer");
        }
        
        /**
         * According to the previous example, we could conclude that
         * the "instanceof" keyword is not invoked by the compiler,and
         * it waits until the runtime, then its executed
         *  
         */
    }

}

class Human {

}

class Developer extends Human {

}
