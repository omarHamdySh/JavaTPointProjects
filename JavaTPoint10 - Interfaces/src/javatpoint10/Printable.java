package javatpoint10;

/**
 * An interface is like a full abstracted class, it's data members are
 * constants, and it's methods are abstract, which means if we declared a
 * variable we have to initialize it, it can't be declared without
 * initialization.
 */
public interface Printable {

    /**
     * Interface members are constants, compiler adds "public static final"
     * keywords to any data member, and you cannot change that.
     */
    int FACTOR = 5;

    /**
     * Interface methods are abstract by default, compiler adds "public
     * abstract" keywords, to each method, and you cannot change that.
     */
    void print();
}
