/**
 * Class: Bank
 * @author: Corbin Hendricks
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: August 16, 2023
 * This class functions like a simple banking system, allowing the user to deposit and withdraw funds.
 */
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        double balance = 5000.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'deposit', 'withdraw', or 'check balance'.");
        String action = input.nextLine();

        switch (action) {
            case "withdraw":
                Scanner withdrawal = new Scanner(System.in);
                System.out.println("How much would you like to withdraw?");
                double withdrawalAmount = withdrawal.nextDouble();

                if (withdrawalAmount > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    double newBalance = balance - withdrawalAmount;
                    System.out.println("Your new balance is " + newBalance + " dollars.");
                }
                break;
            case "deposit":
                Scanner deposit = new Scanner(System.in);
                System.out.println("How much would you like to deposit?");
                double depositAmount = deposit.nextDouble();

                if (depositAmount > 10000.00) {
                    System.out.println("Deposit is greater than deposit limit.");
                } else {
                    double newBalance = balance + depositAmount;
                    System.out.println("Your new balance is " + newBalance + " dollars.");
                }
                break;
            case "check balance":
                System.out.println("Your balance is " + balance + " dollars.");
                break;
            default:
                System.out.println("Command not recognized.");
                break;
        }
    }
}
