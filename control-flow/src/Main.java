public class Main{
    public static void main(String[] args) {
        // Comparison
        int x = 1;
        int y = 2;
        System.out.println(x == y); // Equality
        System.out.println(x != y); // Inequality
        System.out.println(x < y); // Less than

        // Logical Operators
        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30; // And operator
        System.out.println(isWarm);

        // boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // Or Operator (and not operator)
//        System.out.println(isEligible);

        // If Statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temp > 20) {
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        }

        // Simplifying If statements
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

        // Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        // Switch statements
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin ");
                break;

            case "moderator":
                System.out.println("You're a moderator");
                break;

            default:
                System.out.println("You're a guest");
        }
    }
}