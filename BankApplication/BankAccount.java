package BankApplication;

import java.util.Scanner;

public class BankAccount {
        double balance;
        double previousTransaction;
        String customerName;
        String customerId;

        public BankAccount(String customerName, String customerId) {
            this.customerName = customerName;
            this.customerId = customerId;
        }

        public void deposit(double amount) {
            if (amount != 0) {
                balance += amount;
                previousTransaction = amount;
            }
        }

        public void withdraw(double amount) {
            if (amount != 0 && balance >= amount) {
                balance -= amount;
                previousTransaction = -amount;
            } else if (balance < amount) {
                System.out.println("Bank balance is insufficient");
            }
        }

        public void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Withdrawn: " + Math.abs(previousTransaction));
            } else {
                System.out.println("No transaction occurred");
            }
        }

        public void menu() {
            Scanner sc = new Scanner(System.in);
            String option; // Change 'char' to 'String'

            System.out.println("Welcome " + customerName);
            System.out.println("Your ID: " + customerId);
            System.out.println();

            do {
                System.out.println("********************************************");
                System.out.println("Choose an option");
                System.out.println("a) Check Balance");
                System.out.println("b) Deposit Amount");
                System.out.println("c) Withdraw Amount");
                System.out.println("d) Previous Transaction");
                System.out.println("e) Exit");
                System.out.println("********************************************");

                option = sc.next();
                System.out.println();

                switch (option) { 
                    case "a":
                        System.out.println("Balance:  R" + balance);
                        break;
                    case "b":
                        System.out.println("Enter an amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;
                    case "c":
                        System.out.println("Enter an amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case "d":
                        System.out.println("Previous Transaction:");
                        getPreviousTransaction();
                        break;
                    case "e":
                        System.out.println("Thank you for using our banking services.");
                        break;
                    default:
                        System.out.println("Choose a correct option to proceed.");
                        break;
                }

                if (option.equals("e")) { // Compare with a string
                    break;
                }
            } while (true);

            System.out.println("Thank you for using our banking services");
        }


    }


