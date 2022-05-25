package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double availableMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumSabers = Math.ceil(1.1 * students) * saberPrice;
        double sumRobes = robePrice * students;
        double sumBelts = beltPrice * (students - students / 6);

        double neededMoney = sumSabers + sumRobes + sumBelts;

        if (availableMoney >= neededMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", neededMoney - availableMoney);
        }
    }
}
