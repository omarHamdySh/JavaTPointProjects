package javatpoint06;

/**
 *
 * @author abdo_
 */
public class Child extends Parent {

    int dataMember1 = 1000;
    int dataMember2 = 1000;

    @Override
    public int getDataMember1() {
        return dataMember1;
    }

    @Override
    public void setDataMember1(int dataMember1) {
        this.dataMember1 = dataMember1;
    }

    @Override
    void show() {
        System.out.println("I'm a Child");
    }

    /*
    Over loads the method testMe in the parent class
    which takes Cild class object as parameter
     */
    void testMe(Parent P) {
        System.out.println("Child.testMe(Parent)");
    }

    private void privateMethod() {

    }

}
