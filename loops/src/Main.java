import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // For loop
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // While Loops
        int i = 0;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

//      Example: While
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("While - Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            if (input.equals("pass")) {
                continue;
            }
            System.out.println(input);
        }

        // Do...while loop
        do {
            System.out.print("Do-While - Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));

        // For-each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        // For loop: forward and backward iteration; access to index
        for (int j = 0; j < fruits.length; j++) {
            System.out.println(fruits[j]);
        }
        // For each loop: forward-only cannot iterate backwards; no access to each index
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}