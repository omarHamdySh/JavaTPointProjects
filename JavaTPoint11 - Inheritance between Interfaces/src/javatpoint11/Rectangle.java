package javatpoint11;

/**
 * Implementing an extended interface is like implementing the both interfaces.
 */
public class Rectangle implements Shawable {

    @Override
    public void show() {
        System.out.println("Rectangle.show()");
    }

    @Override
    public void print() {
        System.out.println("Rectangle.print()");
    }

    @Override
    public void play() {
        System.out.println("Rectangle.play()");
    }
}
