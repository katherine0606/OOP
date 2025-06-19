package Lab5.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початкову суму вкладення (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Введіть місячний платіж (monthlyDeposit): ");
        double monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (annualRate) у десятковій формі: ");
        double annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років (t): ");
        int years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік (timesCompounded): ");
        int timesCompounded = scanner.nextInt();

        if (timesCompounded <= 0){
            System.out.println("Кількість нарахувань відсотків на рік повинна бути більшою за 0.");
            scanner.close();
            return;
        }

        double futureValue = calculateFutureValue(principal, monthlyDeposit, annualRate, years, timesCompounded);

        System.out.printf("Підсумкова сума через %d років: %.2f\n", years, futureValue);

        scanner.close();
    }

    public static double calculateFutureValue(double principal, double monthlyDeposit, double annualRate, int years, int timesCompounded) {

        double futureValue = principal * Math.pow(1 + (annualRate / timesCompounded), timesCompounded * years);

        double monthlyRate = annualRate / 12.0;
        int totalMonths = years * 12;
        double depositFutureValue = 0;

        for (int i = 0; i < totalMonths; i++) {
            depositFutureValue += monthlyDeposit * Math.pow(1 + monthlyRate, totalMonths - i);
        }

        return futureValue + depositFutureValue;
    }
}
