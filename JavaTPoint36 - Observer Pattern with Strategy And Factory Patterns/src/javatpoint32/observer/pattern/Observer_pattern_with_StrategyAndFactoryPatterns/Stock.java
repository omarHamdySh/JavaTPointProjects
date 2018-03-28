/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatpoint32.observer.pattern.Observer_pattern_with_StrategyAndFactoryPatterns;

/**
 *
 * @author omarhamdy
 */
public abstract class Stock {
   
    private String stockName;



    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
 
    public abstract void observeStock(StockGrabber stockGrabber);
}
