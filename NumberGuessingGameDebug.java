import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGameDebug {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)
         + 1; // Random number between 1 and 100
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);

        // Welcome message and display the random number (for testing/debugging purposes)
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        System.out.println("\nDebug: The number to guess is " + numberToGuess + "\n");

        // Loop until the user guesses the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            // Validate input
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
