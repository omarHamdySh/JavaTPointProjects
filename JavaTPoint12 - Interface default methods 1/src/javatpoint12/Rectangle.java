package javatpoint12;

/**
 *
 * @author abdo_
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
