package javatpoint04;

public class Main {

    /**
     * This example will show you the sequence of execution when there is
     * inheritance and polymorphism.
     *
     * Have a look on this link about auto-widening, auto-boxing and
     * auto-upcasting:
     * http://javaconceptoftheday.com/auto-widening-auto-boxing-auto-upcasting-java/
     */
    public static void main(String... args) {
        System.out.println("Test1");

        Engineer eng1 = new Engineer(2, "Egy", 23);
        System.out.println(eng1.age);

        System.out.println();

        Human hum1 = new Engineer(2, "Egy", 23);
        System.out.println(hum1.age);

        System.out.println("\n\nTest2");

        Employee emp1 = new Employee();
        Human hum2 = new Employee();

        emp1.test();

    }
}
