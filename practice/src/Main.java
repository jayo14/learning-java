import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double time = 0;
        String name = "";

        while (true) {
            System.out.print("What's your name? ");
            name = scanner.next();
            System.out.print("What time is it? ");
            time = scanner.nextDouble();
            if (time >= 0.00 && time < 12.00) {
                System.out.print("Good Morning, " + name);
                break;

            }
            else if (time >= 12.00 && time < 16.00) {
                System.out.print("Good Afternoon, " + name);
                break;
            }
            else if (time >= 16.00 && time <= 20.00) {
                System.out.println("Good Evening, " + name);
                break;
            }
            else if (time >= 20.00 && time <= 24.00) {
                System.out.print("Good Night, " + name);
                break;
            }
            else {
                System.out.println("Enter a valid time. Use dot (.) INSTEAD of column (:) ");
                continue;
            }

        }
    }
}