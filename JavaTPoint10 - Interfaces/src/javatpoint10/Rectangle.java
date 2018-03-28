package javatpoint10;

/**
 * When a class implement an interface, it must either implement it's methods,
 * or be declared as abstract.
 *
 * Implementing multiple interfaces is possible because, interface methods are
 * already abstract and must be overridden, so there can be no ambiguity
 * (multiple inheritance).
 */
public class Rectangle extends Shape implements Showable, Printable {

    /**
     * "print()" method is declared in the both interfaces ("Showable" and
     * "Printable"), yet there is no ambiguity because it has already to be
     * overridden.
     */
    @Override
    public void print() {
        System.out.println("Rectangle.print()");
    }

    /**
     * Overriding an abstract method from "Shape".
     */
    @Override
    void draw() {
        System.out.println("Rectangle.draw()");
    }

    /**
     * Take care that "Showable" interface contains "doSmth1()" method, yet it is
     * not implemented here?? actually it's implemented implicitly, because
     * "Shape" class has a "PUBLIC" method called "doSmth1()" which is inherited
     * here in this class, so it implicitly implemented the "doSmth1()" from
     * "Showable" interface, and I emphasized "public" because in overriding,
     * you cannot lower the access modifier of a method, but you can raise it,
     * "doSmth2()" method will make this clear.
     */
    /**
     * "doSmth2()" its "public" (by default) in "Showable" interface, and
     * "default" in "Shape" class, so "doSmth2()" in "Shape" is inherited in
     * "Rectangle", but because it is "default" it cannot implement the
     * "doSmth2()" in "Showable" interface, so you have to override it using
     * "public" access modifier, and this will make you override the both
     * methods in "Shape" and "Showable"
     *
     * Overriding "doSmth2".
     */
    @Override
    public void doSmth2() {
        System.out.println("Rectangle.doSmth2()");
    }
}
