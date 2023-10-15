package BankApplication;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("$$$$$$ MazikeenDila1 Banking−ElevatingBankingServices $$$$$$");
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
        String name = sc.nextLine();
        String customerId = sc.nextLine();


        if (isValidName(name) && isValidCustomerId(customerId)) {
            name = name.toUpperCase();
            BankAccount obj1 = new BankAccount(name, customerId);
            obj1.menu();
        } else {
            System.out.println("Invalid input. Name must contain only alphabets, and Customer ID must contain only numerical values.");
        }
    }


    public static boolean isValidName(String name) {
        return name.matches("^[a-zA-Z]+$");
    }


    public static boolean isValidCustomerId(String customerId) {
        return customerId.matches("^[0-9]+$");
    }
}
