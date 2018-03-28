/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exampl1;

/**
 *
 * @author omarhamdy
 */
public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if (request.getCalcWanted() == "sub") {

            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "
                    + (request.getNumber1() - request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }

}
