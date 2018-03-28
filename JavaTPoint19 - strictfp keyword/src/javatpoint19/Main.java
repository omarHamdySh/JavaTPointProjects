package javatpoint19;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author abdo_
 */
public class Main {

    public static void main(String[] args) {
        /**
         * To know better about floating point calculations, check this link:
         * https://docs.oracle.com/javase/specs/jls/se9/html/jls-15.html#jls-15.4-120
         */
        Method[] methods = Engineer.class.getMethods();
        for (Method method : methods) {
            System.out.println("Method Name::" + method.getName());
            System.out.println("Modifiers::" + Modifier.toString(method.getModifiers()));
            System.out.println();

        }
    }
}
