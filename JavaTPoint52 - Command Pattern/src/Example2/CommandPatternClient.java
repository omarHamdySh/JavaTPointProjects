package Example2;
/**
 * Kindly Maintain this order:
 * 
 * ActionListenerCommand interface;
 * Document class;
 * ActionSave class;
 * ActionOpen class;
 * MenuOptions class;
 * CommandPatternClient Class;
 * 
 * 
 * @author omarhamdy
 */

public class CommandPatternClient {

    public static void main(String[] args) {
        Document doc = new Document();

        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(clickOpen, clickSave);

        menu.clickOpen();
        menu.clickSave();

    }

}
