import java.util.Scanner;

public class LoginSystemSetup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("--- Set Up Your Account ---");
        System.out.print("Set your username: ");
        String setUsername = scanner.nextLine();

        System.out.print("Set your password: ");
        String setPassword = scanner.nextLine();

        System.out.println("\nAccount created successfully!\n");

        
        int attempts = 3;
        boolean loggedIn = false;

        while (attempts > 0) {
            System.out.println("--- Login ---");
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredUsername.equals(setUsername) && enteredPassword.equals(setPassword)) {
                System.out.println("Login successful! Welcome, " + enteredUsername + "!");
                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Access denied.");
        }

        scanner.close();
    }
}