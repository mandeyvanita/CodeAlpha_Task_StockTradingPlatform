package service;

import model.Portfolio;
import model.Transaction;

import java.io.*;
import java.util.ArrayList;

public class FileService {

    // Save Portfolio
    public void savePortfolio(ArrayList<Portfolio> portfolioList) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("data/portfolio.txt"))) {

            for (Portfolio p : portfolioList) {
                bw.write(p.getStockSymbol() + "," + p.getQuantity());
                bw.newLine();
            }

            System.out.println("Portfolio saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving portfolio.");
        }
    }

    // Save Transactions
    public void saveTransactions(ArrayList<Transaction> transactionList) {

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("data/transactions.txt"))) {

            for (Transaction t : transactionList) {

                bw.write(t.getType() + ","
                        + t.getStockSymbol() + ","
                        + t.getQuantity() + ","
                        + t.getPrice());

                bw.newLine();
            }

            System.out.println("Transactions saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving transactions.");
        }
    }

    // Load Portfolio
    public void loadPortfolio() {

        try (BufferedReader br = new BufferedReader(
                new FileReader("data/portfolio.txt"))) {

            String line;

            System.out.println("\n===== SAVED PORTFOLIO =====");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Portfolio file not found.");
        }
    }

    // Load Transactions
    public void loadTransactions() {

        try (BufferedReader br = new BufferedReader(
                new FileReader("data/transactions.txt"))) {

            String line;

            System.out.println("\n===== SAVED TRANSACTIONS =====");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Transaction file not found.");
        }
    }
}