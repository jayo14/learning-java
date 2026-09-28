import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte NUMBER_OF_MONTHS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = (annualRate / NUMBER_OF_MONTHS) / PERCENT;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * NUMBER_OF_MONTHS;

        double mortgageResult = principal * ((monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments))/((Math.pow((1 + monthlyRate), numberOfPayments) - 1)));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(mortgageResult);
        System.out.println("Mortgage: " + mortgage);
    }
}