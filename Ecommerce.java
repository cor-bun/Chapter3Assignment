/**
 * Class: Ecommerce
 * @author: Corbin Hendricks
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: August 18, 2023
 * This class functions like en Ecommerce application, allowing buying, selling, and inventory checks.
 */
import java.util.Scanner;
public class Ecommerce {
    public static void main(String [] args) {
        int inventory = 50;
        int inventoryLimit = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to buy, sell, or check?");
        String action = input.nextLine();

        switch (action) {
            case "buy":
                Scanner buy = new Scanner(System.in);
                System.out.println("How much would you like to buy?");
                int purchase = buy.nextInt();

                if (inventory - purchase >= 0) {
                    System.out.println("New inventory is " + (inventory - purchase) + ".");
                }
                else {
                    System.out.println("Purchase exceeds available inventory.");
                }
                break;
            case "sell":
                Scanner sell = new Scanner(System.in);
                System.out.println("How much would you like to sell?");
                int market = sell.nextInt();

                if (inventory + market <= inventoryLimit) {
                    System.out.println("New inventory is " + (inventory + market) + ".");
                }
                break;
            case "check":
                System.out.println("Current inventory is " + inventory + ".");
                break;
            default:
                System.out.println("Command not recognized.");
                break;
        }
    }
}
