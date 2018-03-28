package javatpoint14;

/**
 * Unlike default methods, implementing two (or more) interfaces that have same
 * static methods, doesn't force us to create our own method, actually they are
 * not even inherited, actually this is easily understandable when you know that
 * Java 8 constrained them with a beautiful constraint :D, that they cannot be
 * called through an object reference, they can ONLY be called through the
 * interface name.
 */
public class Rectangle implements Showable, Printable {

    @Override
    public void show() {
        System.out.println("Rectangle.show()");
    }

    @Override
    public void print() {
        System.out.println("Rectangle.print()");
    }
}
