package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= orders ; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double priceForOrder = ((days * capsulesCount) * pricePerCapsule);

            totalPrice = totalPrice + priceForOrder;

            System.out.printf("The price for the coffee is: $%.2f%n",priceForOrder);

        }

        System.out.printf("Total: $%.2f", totalPrice);

    }
}
