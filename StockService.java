package service;

import model.Stock;
import java.util.ArrayList;

public class StockService {

    private ArrayList<Stock> stockList;

    // Constructor
    public StockService() {

        stockList = new ArrayList<>();

        // Sample Stocks
        stockList.add(new Stock("TCS", "Tata Consultancy Services", 4200.00));
        stockList.add(new Stock("INFY", "Infosys", 1650.50));
        stockList.add(new Stock("RELIANCE", "Reliance Industries", 2950.75));
        stockList.add(new Stock("HDFCBANK", "HDFC Bank", 1825.25));
        stockList.add(new Stock("ICICIBANK", "ICICI Bank", 1245.50));
        stockList.add(new Stock("SBIN", "State Bank of India", 865.80));
        stockList.add(new Stock("WIPRO", "Wipro", 545.20));
        stockList.add(new Stock("LT", "Larsen & Toubro", 3785.90));
    }

    // Display All Stocks
    public void displayStocks() {

        System.out.println("\n===============================================");
        System.out.println("              AVAILABLE STOCKS");
        System.out.println("===============================================");
        System.out.printf("%-12s %-30s %s%n",
                "SYMBOL", "COMPANY", "PRICE");
        System.out.println("------------------------------------------------");

        for (Stock stock : stockList) {
            System.out.println(stock);
        }

        System.out.println("===============================================");
    }

    // Search Stock
    public Stock findStock(String symbol) {

        for (Stock stock : stockList) {

            if (stock.getSymbol().equalsIgnoreCase(symbol)) {
                return stock;
            }
        }

        return null;
    }

    // Getter
    public ArrayList<Stock> getStockList() {
        return stockList;
    }
}
