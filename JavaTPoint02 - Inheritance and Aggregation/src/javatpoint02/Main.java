package javatpoint02;

/**
 *
 * @author abdo_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        
        System.out.println("\n");
        
        Employee emp2 = new Employee(1, "Abdo", 23, 1000000000);
        emp2.eat();
        emp2.doEmploymentWork();
    }
    
}
