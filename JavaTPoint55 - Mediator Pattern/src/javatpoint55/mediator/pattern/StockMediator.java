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
import java.util.ArrayList;

public class StockMediator implements Mediator {

    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSaleOffers;

    private int colleagueCodes = 0;

    public StockMediator() {

        colleagues = new ArrayList<Colleague>();
        stockBuyOffers = new ArrayList<StockOffer>();
        stockSaleOffers = new ArrayList<StockOffer>();
    }

    public void addColleague(Colleague newColleague) {

        colleagues.add(newColleague);

        colleagueCodes++;

        newColleague.setCollCode(colleagueCodes);

    }

    public void saleOffer(String stock, int shares, int collCode) {

        System.out.println(shares + " shares of " + stock
                + " added to inventory");

        StockOffer newOffering = new StockOffer(shares, stock, collCode);

        stockSaleOffers.add(newOffering);

    }

    public void buyOffer(String stock, int shares, int collCode) {

        boolean stockBought = false;

        for (StockOffer offer : stockSaleOffers) {

            if ((offer.getStockSymbol() == stock) && (offer.getstockShares() == shares)) {

                System.out.println(shares + " shares of " + stock
                        + " bought by colleague code " + offer.getCollCode());

                stockSaleOffers.remove(offer);

                stockBought = true;

            }

            if (stockBought) {
                break;
            }

        }

    }

    public void getstockOfferings() {

        System.out.println("\nStocks for Sale");

        for (StockOffer offer : stockSaleOffers) {

            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());

        }

        System.out.println("\nStock Buy Offers");

        for (StockOffer offer : stockBuyOffers) {

            System.out.println(offer.getstockShares() + " of " + offer.getStockSymbol());

        }

    }

}
