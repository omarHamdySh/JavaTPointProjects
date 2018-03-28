package javatpoint26;

/**
 *
 * @author abdo_
 */
public class MyClass {

}

/**
 * Non-inner class extending member inner class
 */
class ClassOne extends OuterA.MemberTest {

    public ClassOne() {
        new OuterA().super();
    }
}

/**
 * Non-inner class extending static inner class
 */
class ClassTwo extends OuterA.StaticTest {

}

class TestNestedInterfaceClassInheritance{

    /*
    inherit static inner clas that declared within interface body
    */
    class NestedInterfaceClassChild extends NestedInterface.Power{
    
    }
    
    /*
    implementation of  Nested Interface 
    */
    class NestedInterfaceChild implements NestedInterface.sciliton{

        @Override
        public void doSomething() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
}
