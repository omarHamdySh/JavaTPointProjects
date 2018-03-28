/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint55.mediator.pattern;

/**
 *
 * @author omarhamdy
 */
public class JTPoorman extends Colleague {

    public JTPoorman(Mediator newMediator) {
        super(newMediator);

        System.out.println("JT Poorman signed up with the stockexchange\n");

    }

}
