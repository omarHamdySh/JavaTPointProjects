package javatpoint06;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * This project is full of polymorphism examples and demonstrations, feel
     * free to study it slowly and carefully.
     */
    public static void main(String[] args) {
        /**
         * 1- "Parent" and "Child" classes have a data member holding the same
         * name.
         */
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c1 = new Child();
        /**
         * There are two rules for polymorphism:
         *
         * 1st: Data members are accessible according to the reference type -
         * 2nd: Methods are accessible according to the runtime type (real type
         * or object type that has been determined by the constructor).
         */

        System.out.println("Methods:");
        p1.show();
        p2.show();
        c1.show();

        /**
         * In this example all those three objects have the same data members
         * and methods, but there's a great different between the three of them.
         *
         * See which data members and methods are visible in each case.
         */
        System.out.println("Data members:");
        System.out.println(p1.dataMember1);
        System.out.println(p2.dataMember1);
        System.out.println(c1.dataMember1);

        /**
         * We'll get the data members using the getters (which are methods).
         */
        System.out.println("Data members(using getters):");
        System.out.println(p1.getDataMember1());
        System.out.println(p2.getDataMember1());
        System.out.println(c1.getDataMember1());
        
        /**
         * We'll get the data members using the getters (which are methods).
         * Hence dataMember2 getter method isn't overridden in the child class
         */
        System.out.println("Data members(using getters):");
        System.out.println(p1.getDataMember2());
        System.out.println(p2.getDataMember2());
        System.out.println(c1.getDataMember2());

        System.out.println();

        /**
         * - p1's reference type is "Parent" (compiler already doesn't know the
         * real type of an object), so method "testMe(Child)" is only visible to
         * the compiler (and there is no better overloaded methods in "Parent"),
         * so it decided (in compile time) that the chosen method signature
         * should be "testMe(Child)" leaving (not really) it for the JVM to
         * determine which method should be chosen in the runtime, later the JVM
         * created the object and it found it's real type is "Parent", so it
         * looked for a method in "Parent" that matches the given(given by
         * compiler) signature and didn't find but "testMe(Child)" - The
         * compiler didn't really leave the binding for the JVM, actually
         * because the compiler doesn't know the real type of an object, it can
         * only determine the signature of the method should be chosen
         *
         *
         * - p2's reference type is "Parent" so "testMe(Child)" is only visible
         * to the compiler, so it determined that this signature "testMe(Child)"
         * should be maintained in the runtime, later the JVM created the object
         * and found it's real type is "Child", so it looked for a method in
         * "Child" that matches the given(given by compiler) signature and
         * didn't find this method testMe that takes 1 parameter of child type
         * so it checked it's parent class which is "Parent" and found "testMe(Child)"
         * because of the inheritance the Child class can see both methods testMe 
         * the one that takes Child object and the other one that take the Parent object,
         * But here it will first bind the method statically at the compile time and 
         * then bind it dynamically back again at the run time.
         *
         *
         * - c1's reference type is "Child" so "testMe(Parent)"(original) and
         * "testMe(Child)"(inherited) are both visible to the compiler and it
         * will count them as overloaded methods, in case you called
         * "testMe(Child)" the compiler will choose the most specific method
         * according to parameter types, because "Child" can fit into "Parent" (up casting) ,
         * but when there is a specific method that can take "Child" it will
         * choose it, and it will determine that this signature "testMe(Child)"
         * should be maintained in the runtime, later the JVM created the object
         * and found it's real type is "Child", so it looked for a method in
         * "Child" with the given(given by compiler) signature and found it in
         * the inherited methods "testMe(Child)", in case you called
         * "testMe(Parent)", everything will go the same except that the JVM
         * will find it in the original methods.
         */
        p1.testMe(new Child());
        p2.testMe(new Child());
        c1.testMe(new Child());
        c1.testMe(new Parent());
        System.out.println();

        /**
         * There's a rule that says: static, final or private methods are solved
         * out using static binding only, and that's because they cannot be
         * overridden, and I add to that rule the methods you call within a
         * class explicitly, without creating an object (this example will be
         * given in "TestStaticBinding" class), static binding occurs when the
         * runtime can never change the result of it, for the previous methods
         * it happens like so, when the compiler finds out that the best
         * signature you're calling and it's (static, final or private), it just
         * bind it to the signature and leave it for the JVM to just execute it,
         * because whatever was the real type of that object, such methods
         * cannot have another definitions, let's take each case alone:
         *
         * - static methods are class members, calling a static method of a
         * child, from a parent reference, is a programmer stupidity :D but
         * it can be called because the static members are inherited.
         *
         * - final methods cannot be overridden, so if the compiler found a
         * final method in the reference type, it cannot have another version in
         * the real type (if you tried to do so, you'll get a compile time
         * error)
         *
         * - private methods are just visible inside the class itself, so where
         * do you think, another version of it might be? it cannot even override
         * methods :D
         *
         * and of course don't forget if it's bound in the compile time, then
         * compiler won't see but the reference types. see upcoming examples
         */
        testStaticBinding(p1);
        testStaticBinding(p2);
        testStaticBinding(c1);

        System.out.println();

        /**
         * Here c2ompiler sees that "tsb" reference type is "TestStaticBinding":
         *
         * - When calling "staticMethod()", compiler goes to check for the
         * method in it's class, and it finds that it's a static method, so it's
         * a class method (belongs to the class) and the real type of the object
         * cannot change that, so it binds it with the method call, and leaves
         * it for the JVM to execute it
         *
         * - When calling "finalMethod()", compiler goes to check for the method
         * in it's class, and it finds that it's a final method, so it cannot
         * have an overriding method and this must be the last version of the
         * method whatever was the real type is, so compiler binds it with the
         * method call, and leaves it for the JVM to execute it
         *
         * of course all this happen after checking and generating the best
         * signature to be bound.
         */
        TestStaticBinding tsb = new TestStaticBinding();
        tsb.staticMethod();
        tsb.finalMethod();

        System.out.println();

        /**
         * Everything is explained in TestStaticBinding.run() method.
         */
        tsb.run();

        System.out.println();

        /**
         * Testing type promotion and Up casting for the parameter, a type can be promoted implicitly to it's
         * parent type.
         */
        testPromotion(new ArithmeticException());
    }

    public static void testStaticBinding(Parent P) {
        System.out.println("testStaticBinding(Parent)");
    }

    public static void testStaticBinding(Child C) {
        System.out.println("testStaticBinding(Child)");
    }

    public static void testPromotion(Exception ex) {
        System.out.println("testPromotion(Exception ex)");
    }

}
