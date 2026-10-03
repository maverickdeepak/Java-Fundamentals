package decision_structure;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        System.out.println("Enter your grade:");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        switch (grade) {
            case "A":
                System.out.println("You did great");
                break;
            case "B":
                System.out.println("You did good");
                break;
            case "C":
                System.out.println("You did okay");
                break;
            case "D":
                System.out.println("You did okay");
                break;
            case "F":
                System.out.println("You did bad");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
