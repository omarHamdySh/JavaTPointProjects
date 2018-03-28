package javatpoint14;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * Interface static methods.
     */
    public static void main(String[] args) {
        /**
         * As it's mentioned in "Rectangle", interface static methods can ONLY
         * be called through the interface itself, they are not even inherited.
         */
        Showable.tryStatic();
        Printable.tryStatic();

        Rectangle r = new Rectangle();
        r.show();
        r.print();

        Showable s = new Rectangle();
        Printable p = new Rectangle();

        /**
         * You can never call interface static methods through object reference,
         * so these following lines fire compile time error:
         *
         * r.tryStatic();
         *
         * s.tryStatic();
         *
         * p.tryStatic();
         *
         * Rectangle.tryStatic();
         *
         * .
         */
    }
}
