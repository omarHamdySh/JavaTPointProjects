package javatpoint02;

/**
 * Employee 'IS A' Human.
 */
public class Employee extends Human {

    float salary;
    /**
     * Employee 'HAS A' ClassicSuit.
     */
    ClassicSuit classicSuit;

    public Employee() {
        System.out.println("Employee is created");
    }

    /**
     * Because of inheritance, you can see all attributes and behaviors of the
     * superclass.
     */
    public Employee(int id, String name, int age, float salary) {
        
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(int id, String name, int age, float salary, String suitColor, String suitSize) {
        this(id, name, age, salary);
        this.classicSuit = new ClassicSuit(suitColor, suitSize);
    }

    void doEmploymentWork() {
        System.out.println("An employee is working");
    }
}
