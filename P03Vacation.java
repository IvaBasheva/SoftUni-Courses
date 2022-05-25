package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;

        switch (typeOfTheGroup){
            case "Students":
                switch (dayOfWeek){
                    case "Friday":
                        totalPrice = people * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = people * 9.80;
                        break;
                    case "Sunday":
                        totalPrice = people * 10.46;
                        break;
                }
                if (people >= 30) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;

            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = people * 10.90;
                        if (people >= 100){
                            totalPrice = (people - 10) * 10.90;
                        }
                        break;
                    case "Saturday":
                        totalPrice = people * 15.60;
                        if (people >= 100){
                            totalPrice = (people - 10) * 15.60;
                        }
                        break;
                    case "Sunday":
                        totalPrice = people * 16;
                        if (people >= 100){
                            totalPrice = (people - 10) * 16;
                        }
                        break;
                }
                break;

            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = people * 15;
                        break;
                    case "Saturday":
                        totalPrice = people * 20;
                        break;
                    case "Sunday":
                       totalPrice = people * 22.50;
                        break;
                }
                if (people >= 10 && people <= 20){
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
