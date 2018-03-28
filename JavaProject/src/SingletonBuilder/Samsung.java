package SingletonBuilder;

/**
 * There are two option to integrate this class with the whole program
 * 1st to extend Company Abstract class which inherits CD Abstract Class
 * 2nd to implement Packing interface explicitly.
 * 
 * @author omarhamdy
 */

public class Samsung implements Packing {
    private static Samsung samsung=null;
    private static int version=0;
    private Samsung(){}
    public static Samsung getSamsungInstance(){
        if(samsung==null){
            synchronized(Samsung.class){
                if (samsung==null){samsung=new Samsung();};
            }
        }
        version++;
        return samsung;
    }
    @Override
    public int price() {
        return 15;
    }

    @Override
    public String pack() {
        return "Samsung CD Copy"+version;
    }
}//End of the Samsung class.
