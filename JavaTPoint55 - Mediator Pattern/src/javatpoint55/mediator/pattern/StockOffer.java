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
public class StockOffer {

    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int numOfShares, String stock, int collCode) {

        stockShares = numOfShares;
        stockSymbol = stock;
        colleagueCode = collCode;

    }

    public int getstockShares() {
        return stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getCollCode() {
        return colleagueCode;
    }

}
