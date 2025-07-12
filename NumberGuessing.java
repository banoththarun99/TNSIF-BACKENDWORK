import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        int bestScore = Integer.MAX_VALUE;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int maxNumber = 100;
            int maxAttempts = 5;

            System.out.println("\nSelect the difficulty level:");
            System.out.println("1. Easy (1–50, 2 attempts)");
            System.out.println("2. Medium (1–100, 3 attempts)");
            System.out.println("3. Hard (1–200, 5 attempts)");
            System.out.print("Enter your choice (1/2/3): ");
            int difficulty = sc.nextInt();

            switch (difficulty) {
                case 1:
                    maxNumber = 50;
                    maxAttempts = 2;
                    break;
                case 2:
                    maxNumber = 100;
                    maxAttempts = 3;
                    break;
                case 3:
                    maxNumber = 200;
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Medium.");
                    maxNumber = 100;
                    maxAttempts = 3;
                    break;
            }

            int secretNumber = random.nextInt(maxNumber) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nI'm thinking of a number between 1 and " + maxNumber);
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempt(s).");
                    guessedCorrectly = true;

                    if (attempts < bestScore) {
                        bestScore = attempts;
                        System.out.println("🥇 New High Score!");
                    }
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("📉 Too low.");
                } else {
                    System.out.println("📈 Too high.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("😞 Out of attempts! The number was " + secretNumber);
            }

            System.out.println("Best Score (least attempts): " + (bestScore == Integer.MAX_VALUE ? "N/A" : bestScore));
            System.out.print("\nDo you want to play again? (yes/no): ");
            sc.nextLine(); // Consume leftover newline
            String again = sc.nextLine().toLowerCase();
            playAgain = again.equals("yes") || again.equals("y");

        } while (playAgain);

        System.out.println("🙏 Thank you for playing! Come back soon.");
        sc.close();
    }
}