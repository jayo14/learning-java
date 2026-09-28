import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_MONTHS = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = (annualRate / NUMBER_OF_MONTHS) / 100;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * NUMBER_OF_MONTHS;

        double result = principal * ((monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments))/((Math.pow((1 + monthlyRate), numberOfPayments) - 1)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(result);
        System.out.println("Mortgage: " + mortgage);
    }
}