/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1;

/**
 *
 * @author omarhamdy
 */
public class MultNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    @Override
    public void calculate(Numbers request) {

        if (request.getCalcWanted() == "mult") {

            System.out.print(request.getNumber1() + " * " + request.getNumber2() + " = "
                    + (request.getNumber1() * request.getNumber2()));

        } else {

            nextInChain.calculate(request);

        }

    }

}
