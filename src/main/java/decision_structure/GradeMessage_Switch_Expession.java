package decision_structure;

import java.util.Scanner;

public class GradeMessage_Switch_Expession {

    public static void main(String[] args) {
        System.out.println("Enter your grade in capital letter eg: A, B, C, D, F:");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "You did great";
            case "B" -> "You did good";
            case "C", "D" -> {
                yield "You did okay";
            }
            case "F" -> "You did bad";
            default -> "Invalid grade";
        };

        System.out.println(message);

    }
}
