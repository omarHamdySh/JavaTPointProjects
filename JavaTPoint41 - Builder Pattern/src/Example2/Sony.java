package Example2;

/**
 * There are two option to integrate this class with the whole program
 * 1st to extend Company Abstract class which inherits CD Abstract Class
 * 2nd to implement Packing interface explicitly.
 * 
 * @author omarhamdy
 */


public class Sony implements Packing {

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }
}//End of the Sony class.
