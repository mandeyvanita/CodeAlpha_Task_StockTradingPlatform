package service;

import model.Portfolio;
import model.Stock;
import model.Transaction;
import model.User;

import java.util.ArrayList;

public class TradingService {

    private User user;
    private StockService stockService;
    private ArrayList<Portfolio> portfolioList;
    private ArrayList<Transaction> transactionList;

    // Constructor
    public TradingService(User user, StockService stockService) {
        this.user = user;
        this.stockService = stockService;
        portfolioList = new ArrayList<>();
        transactionList = new ArrayList<>();
    }

    // Buy Stock
    public void buyStock(String symbol, int quantity) {

        Stock stock = stockService.findStock(symbol);

        if (stock == null) {
            System.out.println("❌ Stock not found.");
            return;
        }

        double totalAmount = stock.getPrice() * quantity;

        if (!user.withdraw(totalAmount)) {
            System.out.println("❌ Insufficient Balance.");
            return;
        }

        Portfolio portfolio = findPortfolio(symbol);

        if (portfolio == null) {
            portfolioList.add(new Portfolio(symbol, quantity));
        } else {
            portfolio.addQuantity(quantity);
        }

        transactionList.add(
                new Transaction("BUY",
                        symbol,
                        quantity,
                        stock.getPrice()));

        System.out.println("✅ Stock Purchased Successfully.");
        System.out.println("Remaining Balance : ₹" + user.getBalance());
    }

    // Sell Stock
    public void sellStock(String symbol, int quantity) {

        Portfolio portfolio = findPortfolio(symbol);

        if (portfolio == null) {
            System.out.println("❌ You don't own this stock.");
            return;
        }

        if (!portfolio.removeQuantity(quantity)) {
            System.out.println("❌ Not enough shares.");
            return;
        }

        Stock stock = stockService.findStock(symbol);

        double amount = stock.getPrice() * quantity;

        user.deposit(amount);

        transactionList.add(
                new Transaction("SELL",
                        symbol,
                        quantity,
                        stock.getPrice()));

        System.out.println("✅ Stock Sold Successfully.");
        System.out.println("Current Balance : ₹" + user.getBalance());
    }

    // View Portfolio
    public void viewPortfolio() {

        System.out.println("\n========== PORTFOLIO ==========");

        if (portfolioList.isEmpty()) {
            System.out.println("Portfolio is Empty.");
            return;
        }

        for (Portfolio p : portfolioList) {
            System.out.println(p);
        }

        System.out.println("-------------------------------");
        System.out.println("Wallet Balance : ₹" + user.getBalance());
    }

    // View Transactions
    public void viewTransactions() {

        System.out.println("\n======= TRANSACTION HISTORY =======");

        if (transactionList.isEmpty()) {
            System.out.println("No Transactions Found.");
            return;
        }

        for (Transaction t : transactionList) {
            System.out.println(t);
        }
    }

    // Search Portfolio
    private Portfolio findPortfolio(String symbol) {

        for (Portfolio p : portfolioList) {

            if (p.getStockSymbol().equalsIgnoreCase(symbol)) {
                return p;
            }
        }

        return null;
    }

    // Getters
    public ArrayList<Portfolio> getPortfolioList() {
        return portfolioList;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }
}
