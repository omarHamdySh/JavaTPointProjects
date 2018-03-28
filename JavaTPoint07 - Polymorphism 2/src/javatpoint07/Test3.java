package javatpoint07;

class Top3 {

    String method() {
        return "top3";
    }
}

class Middle3 extends Top3 {

    @Override
    String method() {
        return "middle3";
    }
}

class Sub3 extends Middle3 {

    @Override
    String method() {
        return "sub3";
    }

    void test() {
        /**
         * This call is read by the compiler as "this.method()", and because
         * "this"'s reference type is "Sub3", and "this" refers to the current
         * object (which must be "Sub3")", so the compiler determines the most
         * specific method's signature which is "method()" and binds it
         * statically with "method()" in "Sub3", then the JVM creates the object
         * finding that the real type is "Sup3", and according to the given
         * signature, it assures binding the call with method "method()" in
         * "Sub3".
         */
        System.out.println("method()=\t\t\t" + method());
        /**
         * Here the "super"'s reference type is "Middle3", and it refers to the
         * parent's object which must be "Middle3", so the compiler determines
         * the most specific method's signature which is "method()" and binds it
         * statically with "method()" in "Middle3", then the JVM creates the
         * parent object knowing it's type is "Middle3", and according to the
         * given signature, it assures binding the call with method "method()"
         * in "Middle3".
         * 
         * Conclusion: according to the behavior of the super keyword
         * and because as we know before from the very first description of 
         * the JVM behavior with the super and the sub classes which
         * first it creates object of the super class and then it creates object
         * of the sub class and apply the inheritance relationship to both of them
         * according to those two points we could conclude the following:
         * that the behavior of the super keyword is almost identical to the behavior
         * of creating object of the super class inside the sub class and using this
         * object to access the Super('s) members, but the only difference between
         * both ways is that when we create object of the super class it gets new
         * reference and new hash code in the memory to access through it the
         * super class members , but the super keyword it uses the current reference
         * of the current super object that created by the JVM to access the super normally,
         *  to access the super class member using this reference,
         * also this keyword have the same behavior of the super keyword
         * it uses the current object's reference (sub class) to access its member.
         */
        System.out.println("super.method()=\t\t\t" + super.method());
        /**
         * - Casting always changes the reference type (which determine the
         * compiler's readability of methods) but the object itself remains in
         * it's real type (rule: a real type can never be changed, it can be
         * parsed).
         */

        /**
         * Here when we casted "this" to "Middle3", the reference type of "this"
         * is changed to "Middle3", so according to the reference type, the
         * compiler can only see "method()" from "Middle3", so it determined the
         * most specific method's signature "method()" and binds it statically
         * with "method()" in "Middle3", later the JVM creates the real object
         * finding it's real type is "Sub3", so the JVM binds the call with
         * method "method()" in "Sub3"  dynamically.
         * 
         * casting this keyword:
         * as we described before when we use this keyword, its almost like we
         * create an object from the current class but this object will have the
         * same reference of the object created by the user(programmer) to use the
         * class, so lets represent the this keyword in this manner and cast it:
         * sub3 sb3 = (middle3) new sub3();
         * 
         * compile time:
         * and thus the compiler will cast the reference of sub3 to middle3
         * 
         * runtime:
         * then the JVM will dynamically bind the method "method" to the real type 
         * which is sub3, this will make the casting non useful
         * 
         * finally: we made this example to just clarify the behavior but
         * actually it doesn't exist because this keyword refers to the same 
         * reference of the object we are dealing with that's created by the user
         * who is the programmer.
         * 
         *
         */
        System.out.println("((Middle3)this).method()=\t" + ((Middle3) this).method());
        /**
         * Here when we casted "this" to "Top3", the reference type of "this" is
         * changed to "Top3", so according to the reference type, the compiler
         * can only see "method()" from "Top3", so it determined the most
         * specific method's signature "method()" and binds it statically with
         * "method()" in "Top3", later the JVM creates the real object finding
         * it's real type is "Sub3", so the JVM binds the call with method
         * "method()" in "Sub3" dynamically.
         */
        System.out.println("((Top3)this).method()=\t\t" + ((Top3) this).method());
    }
}
