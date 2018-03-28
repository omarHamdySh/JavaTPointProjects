package javatpoint12;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * Testing default methods.
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Showable s = new Rectangle();
        Printable p = new Rectangle();

        r.show();
        r.print();
        r.tryDefault();

        System.out.println();

        s.show();
        s.tryDefault();

        System.out.println();

        p.print();
    }

}
