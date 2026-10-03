package loops;

import java.util.Scanner;

public class Cashier {
    static void main() {
        System.out.println("Enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the cost of item " + (i + 1));
            double cost = scanner.nextDouble();
            total += cost;
        }
        System.out.println("Total " + total);
    }
}
