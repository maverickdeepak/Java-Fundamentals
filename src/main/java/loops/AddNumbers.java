package loops;

import java.util.Scanner;

public class AddNumbers {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter the first number.");
            double firstNumber = scanner.nextDouble();
            System.out.println("Enter the second number.");
            double secondNumber = scanner.nextDouble();

            System.out.println("The sum is " + (firstNumber + secondNumber));

            System.out.println("Would you like to add another pair of numbers? (y/n)");
            again = scanner.next().equalsIgnoreCase("y");
        } while (again);
    }
}
