package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    static void main(String[] args) {
        double salary = get_salary();
        int credit_score = get_credit_score();

        check_credit_status(salary, credit_score);
    }

    public static double get_salary() {
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int get_credit_score() {
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        int credit_score = scanner.nextInt();
        return credit_score;
    }

    public static void check_credit_status(double salary, int credit_score) {
        if (salary >= requiredSalary && credit_score >= requiredCreditScore) {
            System.out.println("You are eligible for the loan.");
        } else {
            System.out.println("You are not eligible for the loan.");
        }
    }
}
