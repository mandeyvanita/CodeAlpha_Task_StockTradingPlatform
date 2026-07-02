import model.User;
import service.FileService;
import service.StockService;
import service.TradingService;
import util.InputUtil;
import view.Menu;

public class Main {

    public static void main(String[] args) {

        User user = new User("Demo User", 100000.0);

        StockService stockService = new StockService();
        TradingService tradingService = new TradingService(user, stockService);
        FileService fileService = new FileService();

        int choice;

        do {

            Menu.displayMenu();

            choice = InputUtil.getInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    stockService.displayStocks();
                    break;

                case 2:
                    String buySymbol = InputUtil.getString("Enter Stock Symbol: ");
                    int buyQty = InputUtil.getInt("Enter Quantity: ");
                    tradingService.buyStock(buySymbol, buyQty);
                    break;

                case 3:
                    String sellSymbol = InputUtil.getString("Enter Stock Symbol: ");
                    int sellQty = InputUtil.getInt("Enter Quantity: ");
                    tradingService.sellStock(sellSymbol, sellQty);
                    break;

                case 4:
                    tradingService.viewPortfolio();
                    break;

                case 5:
                    tradingService.viewTransactions();
                    break;

                case 6:
                    fileService.savePortfolio(tradingService.getPortfolioList());
                    fileService.saveTransactions(tradingService.getTransactionList());
                    break;

                case 7:
                    fileService.loadPortfolio();
                    fileService.loadTransactions();
                    break;

                case 8:
                    System.out.println("\nThank you for using Stock Trading Platform!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 8);
    }
}