package javatpoint18;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This project demonstrate how to enable object cloning for your class.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Human h1 = new Human(1, "Abd-Elrahman Egy", 23);
            Human h2 = h1.clone();

            System.out.println("They're just the same:");
            System.out.println(h1.toString());
            System.out.println(h2.toString());
            System.out.println("But they're different:");
            System.out.println(h1.hashCode());
            System.out.println(h2.hashCode());
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
