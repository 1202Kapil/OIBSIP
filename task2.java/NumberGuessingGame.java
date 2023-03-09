import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        
        // Set up a Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        int guess;
        
        // Loop until the user guesses correctly
        do {
            // Ask the user to guess a number
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            
            // Check if the guess is too high, too low, or correct
            if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! You win.");
            }
        } while (guess != randomNumber);
        
        // Close the Scanner
        scanner.close();
    }
}
