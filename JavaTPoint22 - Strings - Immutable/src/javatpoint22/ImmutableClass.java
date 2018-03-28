 package javatpoint22;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * Immutable classes are just a concept, which says, create final data members,
 * and getters for them (no setters), and an initialization constructor, plus
 * other methods, or system logic
 *
 * Immutable annotation, doesn't mean anything, it's just used to tell user that
 * this object is meant to be Immutable, and for java docs.
 */
@Immutable
public final class ImmutableClass {

    final int num;
    final String str;
    final BufferBuilder bb;

    public ImmutableClass(int num, String str, BufferBuilder bb) {
        this.num = num;
        this.str = str;
        this.bb = bb;
    }

    public int getNum() {
        return num;
    }

    public String getStr() {
        return str;
    }

    /**
     * For mutable objects, return it's clone, and if cloning is not available,
     * copy the object to a new one, and return the local new object.
     */
    public BufferBuilder getBb() {
        BufferBuilder bb = new BufferBuilder(this.bb);
        return bb;
    }
}
