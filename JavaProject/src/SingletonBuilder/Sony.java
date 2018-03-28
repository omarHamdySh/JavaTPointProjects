package SingletonBuilder;

/**
 * There are two option to integrate this class with the whole program 1st to
 * extend Company Abstract class which inherits CD Abstract Class 2nd to
 * implement Packing interface explicitly.
 *
 * @author omarhamdy
 */
public class Sony implements Packing {

    private static Sony sony = null;
    private static int copy=0;
    private Sony() {
    }

    public static Sony getSonyInstance() {

        if (sony == null) {

            synchronized (Sony.class) {
                if (sony == null) {
                    sony = new Sony();
                }
            }
        }
        copy++;
        return sony;
    }

    @Override
    public int price() {
        return 20;
    }

    @Override
    public String pack() {
        return "Sony CD Copy"+copy;
    }
}//End of the Sony class.
