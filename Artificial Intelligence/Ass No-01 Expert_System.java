import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Stock Market Trading System!");
        System.out.println("Please answer the following questions:");

        String Trend = askQuestion("What is the current market trend? (Upwards/Downwords):", sc);
        String Fundamentals = askQuestion("How are the fundamentals of the company? (strong/weak):", sc);
        String Indicators = askQuestion("What do the technical indicators suggest? (positive/negative):", sc);

        boolean shouldBuy = Evaluate(Trend, Fundamentals, Indicators);

        printResult(shouldBuy);

        sc.close();
    }

    public static String askQuestion(String question, Scanner scanner) {
        System.out.print(question + " ");
        return scanner.nextLine();
    }

    public static boolean Evaluate(String Trend, String Fundamentals, String Indicators) {
        return Trend.equalsIgnoreCase("Upwards")
                && Fundamentals.equalsIgnoreCase("strong")
                && Indicators.equalsIgnoreCase("positive");
    }

    public static void printResult(boolean shouldBuy) {
        if (shouldBuy) {
            System.out.println("Recommendation: Buy the stock!");
        } else {
            System.out.println("Recommendation: Do not buy the stock.");
        }
    }
}

// Output:

// Welcome to the Stock Market Trading System!
// Please answer the following questions:
// What is the current market trend? (Upwards/Downwords): Upwards
// How are the fundamentals of the company? (strong/weak): strong
// What do the technical indicators suggest? (positive/negative): positive
// Recommendation: Buy the stock!
