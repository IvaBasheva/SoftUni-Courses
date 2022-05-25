package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashes = 0;
        int moiseTrashes = 0;
        int keyboardTrashes = 0;


        for (int i = 1; i <= lostGames ; i++) {

            if (i % 2 == 0){
                headsetTrashes ++;
            }
            if (i % 3 == 0) {
                moiseTrashes ++;
            }
            if(i % 2 == 0 && i % 3 == 0){
                keyboardTrashes ++;
            }
        }
        int displayTrashes = keyboardTrashes / 2;

        double totalPrice = headsetPrice * headsetTrashes + mousePrice * moiseTrashes +
                keyboardPrice * keyboardTrashes + displayPrice * displayTrashes;
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
