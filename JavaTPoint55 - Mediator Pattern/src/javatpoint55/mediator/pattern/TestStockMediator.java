/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint55.mediator.pattern;

/**
 * Kindly maintain this order:
 * 
 * StockOffer class;
 * Colleague abstract class;
 * Mediator interface;
 * JTPoorman class; <*Colleague 1*>
 * GormanSlacks class; <*Colleague 2*>
 * StockMediator class; <*Mediator*>
 * TestStockMediator class; hard coded <*Client*> 
 * @author omarhamdy
 */
public class TestStockMediator {

    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks broker = new GormanSlacks(nyse);

        JTPoorman broker2 = new JTPoorman(nyse);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nyse.getstockOfferings();

    }

}
