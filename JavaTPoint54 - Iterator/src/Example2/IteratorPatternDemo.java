package Example2;

/**
 * Kindly maintain this order:
 * 
 * Iterator interface;
 * Container interface;
 * CollectionNames class;
 * IteratorPatternDemo class;
 * 
 * @author omarhamdy
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        CollectionofNames cmpnyRepository = new CollectionofNames();

        for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

    }
}
