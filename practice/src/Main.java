import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double time = 0;
        while (true) {
            System.out.print("What time is it? ");
            time = scanner.nextDouble();
            if (time >= 0.00 && time < 12.00) {
                System.out.print("Good Morning, John");
                break;

            }
            else if (time >= 12.00 && time < 16.00) {
                System.out.print("Good Afternoon, John");
                break;
            }
            else if (time >= 16.00 && time <= 20.00) {
                System.out.println("Good Evening, John");
                break;
            }
            else if (time >= 20.00 && time <= 24.00) {
                System.out.print("Good Night, John");
                break;
            }
            else {
                System.out.println("Enter a valid time. Use dot (.) INSTEAD of column (:) ");
                continue;
            }

        }
    }
}