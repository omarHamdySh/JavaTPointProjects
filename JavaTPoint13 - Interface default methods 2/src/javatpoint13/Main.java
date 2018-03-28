package javatpoint13;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * Testing default methods that cause ambiguity.
     * 
     * maintain this order: Showable, Printable, Shape, Rectangle
     */
    public static void main(String[] args) {
        Showable s = new Rectangle();
        Printable p = new Rectangle();
        Rectangle r = new Rectangle();

        s.show();
        s.tryDefault();

        System.out.println();

        p.print();
        p.tryDefault();

        System.out.println();

        r.print();
        r.show();
        r.tryDefault();
    }

}
