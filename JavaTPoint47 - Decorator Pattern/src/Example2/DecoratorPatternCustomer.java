package Example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Kindly Maintain this order:
 * Food interface;
 * FoodType class;
 * VegFood class;
 * FoodDecorator abstract class;
 * NonVegFood class;
 * ChineeseFood class;
 * DecoratorPatternCustomer class;
 * 
 * @author omarhamdy
 */
public class DecoratorPatternCustomer {

    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {

        do {
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Non-Vegetarian Chinees food      \n");
            System.out.print("            54. Exit                        \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {

                    VegFood vf = new VegFood();

                    System.out.println(vf.prepareFood());

                    System.out.println(vf.foodPrice());

                }
                break;

                case 2: {

                    //Food f1 = new NonVegFood((Food) new VegFood());
                    Food f1 = new NonVegFood(new GenericFoodType());

                    
                    System.out.println(f1.prepareFood());

                    System.out.println(f1.foodPrice());

                }
                break;

                case 3: {

                    Food f2 = new ChineeseFood(new GenericFoodType());

                    System.out.println(f2.prepareFood());

                    System.out.println(f2.foodPrice());

                }
                break;
               
                case 4: {
/**
 * Notice that the logic order of using the objects instantiated using decorator pattern
 * is named in a reversed order, Eg. Non-Vegetarian Chineese Food (Chineese(NonVegetarian))
 */
                    Food f2 = new ChineeseFood(new NonVegFood(new GenericFoodType()));

                    System.out.println(f2.prepareFood());

                    System.out.println(f2.foodPrice());

                }
                break;

                default: {
                    System.out.println("Other than these no food available");

                }
                return;
            }

        } while (choice != 4);

    }

}
