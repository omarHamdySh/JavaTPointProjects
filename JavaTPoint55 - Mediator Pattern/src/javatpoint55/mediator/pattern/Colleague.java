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
public abstract class Colleague {

    private Mediator mediator;
    private int colleagueCode;

    public Colleague(Mediator newMediator) {
        mediator = newMediator;

        mediator.addColleague(this);

    }

    public void saleOffer(String stock, int shares) {

        mediator.saleOffer(stock, shares, this.colleagueCode);

    }

    public void buyOffer(String stock, int shares) {

        mediator.buyOffer(stock, shares, this.colleagueCode);

    }

    public void setCollCode(int collCode) {
        colleagueCode = collCode;
    }

}
