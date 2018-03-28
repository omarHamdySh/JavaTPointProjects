/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 * Gallon: غالون
 *      - Gallon = 4 Quarts/liter
 * Quarts: ليترات
 * Quart :ربع جالون
 *      - Quart = 2 Pints
 * Pint= مكيال
 *      - Pint = 2 Cups 
 * Cup= كوب
 *      - Cup = * 16 Spoon
 * tableSpoon= ملعقة
 * 
 * @author omarhamdy
 */
public class Gallons extends Expression {

    public String gallons(double quantity) {

        return Double.toString(quantity);
    }

    public String quarts(double quantity) {
        return Double.toString(quantity * 4);
    }

    public String pints(double quantity) {
        return Double.toString(quantity * 8);
    }

    public String cups(double quantity) {
        return Double.toString(quantity * 16);
    }

    public String tablespoons(double quantity) {
        return Double.toString(quantity * 256);
    }

}
