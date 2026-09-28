import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        // Approach 1: Cleaner and easier to read
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }

        // Approach 2: DRY, but amateurish due to nested if statements
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println("FizzBuzz");
            }
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}