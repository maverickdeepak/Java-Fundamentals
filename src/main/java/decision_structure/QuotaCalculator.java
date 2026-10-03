package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales employee did this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        scanner.close();

        if(sales < quota){
            System.out.println("You have to do " + (quota - sales) + " 🔖 sales more.");
        } else {
            System.out.println("🎊 You have achieved your target. 🎯");
        }
    }
}
