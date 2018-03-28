package javatpoint20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import plan.*;

/**
 *
 * @author abdo_
 */
public class GenerateBill {

    /**
     * Factory Method Design Pattern.
     */
    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the name of plan for which the bill will be generated"
                + " (domesticplan, commercialplan, institutionalplan): ");
        String planName = br.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        //Using Factory
        Plan p = planFactory.getPlan(planName);
        //Using Static Factory Method
        Plan pp = Plan.getPlan(planName);

        //call getRate() method and calculateBill() method of plan.  
        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}
