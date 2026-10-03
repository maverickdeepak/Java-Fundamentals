package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double max_hours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hours_worked = scanner.nextDouble();

        while(hours_worked > max_hours) {
            System.out.println("Invalid entry. Your working hours must be between 1 to 40. Try again.");
            hours_worked = scanner.nextDouble();
        }

        scanner.close();

        double gross_pay = rate * hours_worked;
        System.out.println("Your gross pay is: $" + gross_pay);
    }
}
