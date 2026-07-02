package model;

public class Transaction {

    private String type;
    private String stockSymbol;
    private int quantity;
    private double price;

    // Constructor
    public Transaction(String type, String stockSymbol, int quantity, double price) {
        this.type = type;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Display transaction details
    @Override
    public String toString() {
        return String.format(
                "%-5s | %-10s | Qty: %-3d | Price: ₹%.2f",
                type,
                stockSymbol,
                quantity,
                price);
    }
}
