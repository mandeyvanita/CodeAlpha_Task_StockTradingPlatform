package model;

public class Portfolio {

    private String stockSymbol;
    private int quantity;

    // Constructor
    public Portfolio(String stockSymbol, int quantity) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
    }

    // Getter
    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    // Add shares
    public void addQuantity(int qty) {
        quantity += qty;
    }

    // Remove shares
    public boolean removeQuantity(int qty) {

        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }

        return false;
    }

    // Display portfolio details
    @Override
    public String toString() {
        return String.format("%-12s Quantity : %d",
                stockSymbol, quantity);
    }
}
