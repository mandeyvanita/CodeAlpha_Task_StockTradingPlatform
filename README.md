# CodeAlpha_Task_StockTradingPlatform
A console-based Stock Trading Platform developed in Java that allows users to buy/sell stocks, manage portfolios, track transactions, and store data using file handling.


# 📈 Stock Trading Platform

A Java-based **Stock Trading Platform** that allows users to buy and sell stocks, manage portfolios, track transaction history, and save data using File Handling. This project demonstrates Object-Oriented Programming (OOP), Collections, Exception Handling, and File I/O concepts.

---

## 📌 Features

- 📊 View Available Stocks
- 💰 Buy Stocks
- 💸 Sell Stocks
- 📁 Manage Portfolio
- 📜 View Transaction History
- 💾 Save Portfolio & Transactions
- 📂 Load Saved Data
- 💳 Wallet Balance Management
- 🖥️ Menu-Driven Console Application

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections (ArrayList)
- File Handling
- Exception Handling
- VS Code
- JDK 17+

---

## 📂 Project Structure

```
StockTradingPlatform
│
├── src
│   ├── Main.java
│   │
│   ├── model
│   │   ├── Stock.java
│   │   ├── User.java
│   │   ├── Portfolio.java
│   │   └── Transaction.java
│   │
│   ├── service
│   │   ├── StockService.java
│   │   ├── TradingService.java
│   │   └── FileService.java
│   │
│   ├── util
│   │   └── InputUtil.java
│   │
│   └── view
│       └── Menu.java
│
└── data
    ├── portfolio.txt
    ├── transactions.txt
    └── stocks.txt
```

---

## 🚀 How to Run

### 1. Clone Repository

```bash
git clone https://github.com/YourUsername/StockTradingPlatform.git
```

### 2. Open Project

Open the project in **VS Code**.

### 3. Open Terminal

Go to the project directory.

```bash
cd StockTradingPlatform/src
```

### 4. Compile

```bash
javac Main.java model/*.java service/*.java util/*.java view/*.java
```

### 5. Run

```bash
java Main
```

---

## 📋 Menu

```
1. View Available Stocks
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. View Transaction History
6. Save Data
7. Load Saved Data
8. Exit
```

---

## 💡 Sample Output

```
====================================
     STOCK TRADING PLATFORM
====================================
1. View Available Stocks
2. Buy Stock
3. Sell Stock
4. View Portfolio
5. View Transaction History
6. Save Data
7. Load Saved Data
8. Exit
Enter Choice:
```

---

## 📖 Concepts Used

- Classes & Objects
- Encapsulation
- Constructors
- ArrayList
- File Handling
- Exception Handling
- Java Packages
- Menu-Driven Programming

---

## 🎯 Future Enhancements

- User Login Authentication
- Database Integration (MySQL)
- Live Stock Price Updates
- GUI using JavaFX/Swing
- Profit & Loss Analysis
- Admin Panel

---

## 👩‍💻 Author

**Your Name**

Java Developer Intern

---

## ⭐ GitHub

If you like this project, don't forget to **Star ⭐ the repository**.
