/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example2;

/**
 *
 * @author omarhamdy
 */
public class EmployeeRecord implements Prototype {
   
   private int id;
   private String name, designation;
   private double salary;
   private String address;
    
   public EmployeeRecord(){
            System.out.println("   Employee Records of Oracle Corporation ");
            System.out.println("---------------------------------------------");
            System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t"+"Eaddress");
    
}

 public  EmployeeRecord(int id, String name, String designation, double salary,String address) {
        
        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }
    
  public void showRecord(){
        
        System.out.println(id+"\t"+name+"\t"+designation+"\t\t"+salary+"\t"+address);
   }

    @Override
    public Prototype getClone() {
        
        return new EmployeeRecord(id,name,designation,salary,address);
    }
}
