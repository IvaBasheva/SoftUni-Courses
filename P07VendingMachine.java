package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String command = scanner.nextLine();

        double moneySum = 0;

        while (!command.equals("Start")) {
            double money = Double.parseDouble(command);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                moneySum = moneySum + money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            command = scanner.nextLine();
        }

        String product = scanner.nextLine();

        double price = 0;

        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    price = 2.0;
                    if (moneySum >= price){
                        System.out.printf("Purchased %s%n",product);
                        moneySum = moneySum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (moneySum >= price){
                        System.out.printf("Purchased %s%n",product);
                        moneySum = moneySum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (moneySum >= price){
                        System.out.printf("Purchased %s%n",product);
                        moneySum = moneySum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (moneySum >= price){
                        System.out.printf("Purchased %s%n",product);
                        moneySum = moneySum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (moneySum >= price){
                        System.out.printf("Purchased %s%n",product);
                        moneySum = moneySum - price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneySum);
    }
}
