/**
 * Class: Transportation
 * @author: Corbin Hendricks
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: August 18, 2023
 * This class lets the user select various modes of transportation and between their specific models.
 */
import java.util.Scanner;
public class Transportation {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to travel by car, train, or plane?");
        String transport = input.nextLine();

        switch (transport) {
            case "car":
                Scanner car = new Scanner(System.in);
                System.out.println("Sedan or sports?");
                String carModel = car.nextLine();

                switch (carModel) {
                    case "sedan":
                        System.out.println("Maximum Speed = 120 mph");
                        break;
                    case "sports":
                        System.out.println("Maximum Speed = 200 mph");
                        break;
                    default:
                        System.out.println("Model not recognized.");
                }
                break;
            case "train":
                Scanner train = new Scanner(System.in);
                System.out.println("Bullet or freight?");
                String trainModel = train.nextLine();

                switch (trainModel) {
                    case "bullet":
                        System.out.println("Maximum Speed = 250 mph");
                        break;
                    case "freight":
                        System.out.println("Maximum speed = 70 mph");
                    default:
                        System.out.println("Model not recognized.");
                }
                break;
            case "plane":
                Scanner plane = new Scanner(System.in);
                System.out.println("Jet or propeller?");
                String planeModel = plane.nextLine();

                switch (planeModel) {
                    case "jet":
                        System.out.println("Maximum Speed = 600 mph");
                        break;
                    case "propeller":
                        System.out.println("Maximum Speed = 200 mph");
                        break;
                    default:
                        System.out.println("Model not recognized.");
                }
            default:
                System.out.println("Transportation model not recognized.");
        }
    }
}
