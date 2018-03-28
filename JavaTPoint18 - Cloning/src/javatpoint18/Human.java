package javatpoint18;

/**
 * To use object cloning, we must implement "Cloneable" interface, otherwise
 * we'll receive a "CloneNotSupportedException", and the "clone()" method is
 * "protected", so if we want it to be accessed outside the class, we must
 * override it with a higher access modifier, which is nothing but "public".
 */
public class Human implements Cloneable {

    int id;
    String name;
    int age;

    public Human(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * If you want the "clone()" method to clone objects, you must return the
     * object returned by "super.clone()", you may like to try to change the
     * return type to be as the same class you're cloning which here is "Human"
     * (covariant return type), but you must cast the returned type of
     * "super.clone()" to "Human".
     */
    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (this);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tName: " + name + "\tAge: " + age;
    }
}
