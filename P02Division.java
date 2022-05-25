package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int divisibleBy2 = 0;
        int divisibleBy3 = 0;
        int divisibleBy6 = 0;
        int divisibleBy7 = 0;
        int divisibleBy10 = 0;

        boolean isNotDivisible = false;

        if (number % 2 == 0 && number % 3 == 0 && number % 10 != 0) {
            divisibleBy6++;
        } else if (number % 2 == 0 && number % 10 != 0) {
            divisibleBy2++;
        } else if (number % 3 == 0 && number % 2 != 0) {
            divisibleBy3++;
        } else if (number % 7 == 0) {
            divisibleBy7++;
        } else if (number % 10 == 0) {
            divisibleBy10++;
        } else {
            isNotDivisible = true;
        }

        if (isNotDivisible) {
            System.out.println("Not divisible");
        } else if (divisibleBy2 == 1) {
            System.out.println("The number is divisible by 2");
        } else if (divisibleBy3 == 1) {
            System.out.println("The number is divisible by 3");
        } else if (divisibleBy6 == 1) {
            System.out.println("The number is divisible by 6");
        } else if (divisibleBy7 == 1) {
            System.out.println("The number is divisible by 7");
        } else if (divisibleBy10 == 1) {
            System.out.println("The number is divisible by 10");
        }
    }
}
