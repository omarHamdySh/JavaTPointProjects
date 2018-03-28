package javatpoint22;

/**
 * Strings are created using different ways, and each way has a different
 * methodology in memory management
 *
 * These double quotations "" are called String literals, the JVM allocate them
 * in a special part of heap called "String constant pool", when you declare a
 * new "String" and assign a value to it using double quotations or other
 * "String" variables that are assigned using double quotations, the JVM checks
 * if the value of the String literal exists in the String pool or not, and if
 * it does, it makes the "String" variable (which is in stack) refers to it in
 * the pool (which is in the heap), this means that all Strings that are
 * assigned using String literal in a program and have the same value will refer
 * to the same object, this guarantees a professional memory management
 *
 * If you declared a "String" variable and assigned a value to it using
 * (1-String constructors, 2-String methods (concat, substring, '+' (not always
 * - check method testReferences()), etc), 3-other String variable that used one
 * of the previous methods), the JVM will always create a new object for the
 * "String" value, not considering the String pool at all
 *
 * Take into consideration, that Strings are "immutable", which means they are
 * not editable, and if you tried to edit it's value, a new object will be
 * created with the new edited value, so don't panic, changing a "String" will
 * not affect other Strings (if it was literal of course).
 *
 * Review this link if you can't understand this:
 * http://javaconceptoftheday.com/how-the-strings-are-stored-in-the-memory/
 */
public class StringTester {

    String good = "good";
    String morning = "morning";
    String people = "people";

    String a1;
    String a2;
    String b1;
    String b2;
    String c1;
    String c2;

    public void testStringPool() {
        /**
         * At first you should know that '==' is used for Strings to compare the
         * objects references, not values.
         */
        a1 = "good";
        a2 = "good";
        b1 = new String("morning");
        b2 = new String("morning");
        c1 = new String(new char[]{'p', 'e', 'o', 'p', 'l', 'e'});
        c2 = new String(new char[]{'p', 'e', 'o', 'p', 'l', 'e'});

        System.out.println("Testing string pool:-");
        System.out.println("a1: " + (a1 == good));
        System.out.println("a1: " + (a2 == good));
        System.out.println("b2: " + (b1 == morning));
        System.out.println("b2: " + (b2 == morning));
        System.out.println("c3: " + (c1 == people));
        System.out.println("c3: " + (c2 == people));

        System.out.println();
    }

    public void testReferences() {
        String hello = "hello";
        String hel = "hel";
        String lo = "lo";

        System.out.println("Testing references:-");
        /**
         * At first you should know that '==' is used for Strings to compare the
         * objects references, not values.
         */
        System.out.println(hello == "hello");

        /**
         * The '+' operand works for Strings as a concatenator, but it works in
         * a special way, it works like this:
         *
         * - (literal + literal = literal) this means when it finds two
         * literals, it will produce a literal (inside the String pool)
         *
         * - (String + String = String) this means when it finds two Strings, it
         * will produce a String (outside the String pool)
         *
         * - (String + literal = String) this means when it finds one literal
         * and the other is String, it will produce a String (outside the String
         * pool)
         *
         * - (literal + String = String) same as the above rule.
         */
        System.out.println(hello == ("hel" + "lo"));
        System.out.println(hello == ("hel" + lo));
        System.out.println(hello == (hel + "lo"));
        System.out.println(hello == (hel + lo));

        /**
         * "intern()" method returns a String from the String pool, it works like
         * this: when it's called over a String, it checks if this String exists
         * in the String pool, and if it does, it returns a reference to it, and
         * if it doesn't, it creates it (inside the pool) and returns a
         * reference to it
         *
         * The same three previous lines but with intern method.
         */
        System.out.println(hello == ("hel" + lo).intern());
        System.out.println(hello == (hel + "lo").intern());
        System.out.println(hello == (hel + lo).intern());

        System.out.println();
    }
}
