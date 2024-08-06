import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for Name GUI, 2 for Random Number, 0 to Exit");
            int read = Integer.parseInt(sc.nextLine());

            switch (read) {
                case 1:
                    SwingUtilities.invokeLater(DemoGUI::createGUI);
                    break;
                case 2: {
                    RandomNumberGenerator rng = new RandomNumberGenerator();
                    int origin ;
                    int bound;

                    while (true) {
                        try {
                            System.out.println("Enter the origin number: ");
                            origin = Integer.parseInt(sc.nextLine());

                            System.out.println("Enter the bound number: ");
                            bound = Integer.parseInt(sc.nextLine());

                            if (origin >= bound) {
                                System.out.println("Error: Origin must be less than bound. Please enter the values again.");
                            } else {
                                int randomNumber = rng.getNextInt(origin, bound);
                                System.out.printf("Random number between %d and %d: %d%n", origin, bound, randomNumber);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter valid numbers.");
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Exiting the application.");
                    sc.close(); // Close the scanner
                    System.exit(0); // Exit the application
                    break;
                default:
                    System.out.println("Invalid option selected. Please enter 1, 2, or 0");
                    break;
            }
        }
    }
}
