package javatpoint06;

/**
 *
 * @author abdo_
 */
public class Parent {

    int dataMember1 = 0;
    int dataMember2 = 0;

    public int getDataMember1() {
        return dataMember1;
    }

    public void setDataMember1(int dataMember1) {
        this.dataMember1 = dataMember1;
    }

    public int getDataMember2() {
        return dataMember2;
    }

    public void setDataMember2(int dataMember2) {
        this.dataMember2 = dataMember2;
    }

    void show() {
        System.out.println("I'm a Parent");
    }

    void testMe(Child C) {
        System.out.println("Parent.testMe(Child)");
    }

    private void privateMethod() {

    }

}
