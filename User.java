package model;

public class User {

    private String name;
    private double balance;

    // Constructor
    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw Money
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Display User Details
    @Override
    public String toString() {
        return "User Name : " + name +
                "\nWallet Balance : ₹" + balance;
    }
}
