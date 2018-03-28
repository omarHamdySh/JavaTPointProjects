package javatpoint22;

import java.util.Scanner;

/**
 * - "StringBuffer" and "StringBuilder" are mutable, which means an object can
 * be edited
 *
 * - "StringBuffer" is "synchronized" thread safe, which means, it cannot be
 * accessed by threads simultaneously, which results in an order
 *
 * - "StringBuilder is not "synchronized", which means it's not thread safe
 *
 * BTW "StringBuffer" and "StringBuilder" have "reverse()" method, which
 * reverses a String, while "String" doesn't have such method.
 */
public class BufferBuilder {

    StringBuffer a1;
    StringBuffer a2;
    StringBuilder b1;
    StringBuilder b2;

    BufferBuilder(BufferBuilder bb) {
    }
    
    /*
    Note: StringBuffer and StringBuilder Classes has Almost the same functions
    But there are two major differences we discussed in the top of this class:
    StringBuffer: Thread Safe & Less Efficient.
    StringBuilder: Not Thread Safe & More Efficient.
    */
    public void StringBufferFunctions(){
    
        StringBuffer sb = new StringBuffer("Name: ");
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please Enter A Name: \n");
        
        String str = scn.nextLine();
        
        sb.append(str);
        
        System.out.println("You Entered \n" + sb);

        /*
        in the following examples the numeric parameters 
        represents the start and end Indicies respectively.
         */
        sb.insert(5, "الاسم");
        /*
        despite that the word 'name' is smaller than the word 'الإسم'
        But we have to determine in the next line of code the boundries 
        according to the word will be removed before the replace being done,
        Just to make sure that the old word will be removed to the last character.
         */
        sb.replace(5, 10, "Name");
        /*
        Note that the End Index is not '10' because the word 'Name' is just 4 characters.
         */
        sb.delete(5, 9);
        System.out.println(sb);

        sb.reverse();

        System.out.println("Reversed: \n"+sb);

    }
}
