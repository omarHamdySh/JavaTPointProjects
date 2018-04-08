/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bundles;

import java.util.ListResourceBundle;

/**
 *
 * @author omarhamdy
 */
public class colourBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }
    static final Object[][] contents = {{"colour.Violet", "Here is Violet"},
    {"colour.Indigo", "Indigo From Bundle Class"}, {"colour.Blue", "Blue is the color bundle message value of the key \"colour.Blue\""},};
}
