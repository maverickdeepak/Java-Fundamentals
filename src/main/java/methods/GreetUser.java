package methods;

import java.util.Scanner;

public class GreetUser {
    static void main(String[] args) {
        String name = get_user_name();
        greet_user(name);
    }

    public static String get_user_name() {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void greet_user(String name) {
        System.out.println("Hello " + name);
    }
}
