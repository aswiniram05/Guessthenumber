import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;  // random number 1-100
        int numberOfAttempts = 0;
        int maxAttempts = 7;
        boolean hasWon = false;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (numberOfAttempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess == numberToGuess) {
                System.out.println("🎉 Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                hasWon = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }

            System.out.println("Attempts left: " + (maxAttempts - numberOfAttempts));
        }

        if (!hasWon) {
            System.out.println("Sorry! You've used all your attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
