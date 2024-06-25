
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueRolling = true;
        int throwCount = 0;

        while (continueRolling) {
            boolean gotTriple = false;

            while (!gotTriple) {
                throwCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("Throw %d: %d %d %d (Sum: %d)%n", throwCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    gotTriple = true;
                    System.out.println("Triple! All dice have the same value.");
                }
            }

            System.out.print("Do you want to roll again? (yes/no): ");
            String response = scanner.next();
            continueRolling = response.equalsIgnoreCase("yes");

            if (continueRolling) {
                throwCount = 0;  // Reset the throw count for a new game
            }
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}
