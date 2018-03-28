package javatpoint26;

/**
 *
 * @author abdo_
 */
public class OuterB {

    class MemberTest {

    }

    static class StaticTest {

    }

    class MemberXY extends OuterA.MemberA{
        public MemberXY(){
            new OuterA().super();
        }
    }
}
