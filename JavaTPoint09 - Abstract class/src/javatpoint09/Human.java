package javatpoint09;

/**
 * An "abstract" class is declared to introduce abstraction through introducing
 * abstract class and prevention of creating objects of it, however you can
 * still create an object of it using anonymous inner class, but actually it's
 * just a workaround, because when the compiler faces an anonymous inner class,
 * it creates a new class that extends the abstract class, then creates an object
 * of it, then refers to it by the variable used to declare the object, ummm I'm
 * sorry, you'll learn this later in inner classes :D
 *
 * Let's get back to our topic, an abstract class can have abstract methods, or
 * not, but if there is an abstract method, there must be an abstract class.
 */
abstract class Human {

    int id;
    String name;
    int age;

    /**
     * "abstract" methods are not implemented, they're just signatures that
     * should be overridden by subclasses ,,, abstract methods must be declared
     * in abstract classes.
     */
    abstract void talk();
}
