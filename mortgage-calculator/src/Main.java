import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte NUMBER_OF_MONTHS = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyRate = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal (₦1K - ₦1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            else {
                System.out.println("Enter a value between 1,000 and 1,000,000.");
            }
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualRate = scanner.nextFloat();
            if (annualRate > 0 && annualRate <= 30) {
                monthlyRate = (annualRate / NUMBER_OF_MONTHS) / PERCENT;
                break;
            }
            else {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        while (true) {
            System.out.print("Period (Years): ");
            byte period = scanner.nextByte();
            if (period > 0 && period <= 30) {
                numberOfPayments = period * NUMBER_OF_MONTHS;
                break;
            }
            else {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        double mortgageResult = principal * ((monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments))/((Math.pow((1 + monthlyRate), numberOfPayments) - 1)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(mortgageResult);
        System.out.println("Mortgage: " + mortgage);
    }
}