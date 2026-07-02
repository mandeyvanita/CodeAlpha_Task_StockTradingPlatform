package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    // Read Integer
    public static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            scanner.next();
            System.out.print(message);
        }
        return scanner.nextInt();
    }

    // Read Double
    public static double getDouble(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Enter a valid number.");
            scanner.next();
            System.out.print(message);
        }
        return scanner.nextDouble();
    }

    // Read String
    public static String getString(String message) {
        System.out.print(message);
        return scanner.next();
    }
}
