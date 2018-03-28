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
public class StockFactory {

    Stock stock;

    public StockFactory() {
    }

    public Stock getStockToObserve(int stockName) {

        if (stockName==(1)) {
            this.stock = new IBM_Stock();
        } else if (stockName==(2)) {
            this.stock = new AAPL_Stock();
        } else if (stockName==(3)) {
            this.stock = new GOOG_Stock();
        }
        return stock;
    }

}
