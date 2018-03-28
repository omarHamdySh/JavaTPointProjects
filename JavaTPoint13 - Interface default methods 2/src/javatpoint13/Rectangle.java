package javatpoint13;

/**
 *
 * @author abdo_
 */
public class Rectangle implements Showable, Printable {

    /**
     * If a class implemented two (or more) interfaces that have the same
     * "default" method, it will lead to ambiguity, then that "default" method
     * must be overridden in this class, declaring the class as abstract will
     * not solve the ambiguity problem.
     */
    @Override
    public void tryDefault() {
        System.out.println("Rectangle.tryDefault()");
    }

    @Override
    public void show() {
        System.out.println("Rectangle.show()");
    }

    @Override
    public void print() {
        System.out.println("Rectangle.print()");
    }
}
