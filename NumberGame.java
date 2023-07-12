import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 5;
        int score = 0;
    
        System.out.println("Welcome to Number Game!");
        System.out.println("Guess a number between a range" + min + " and " + max);
        
        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(max - min + 3) + min;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your number: ");
                int guess = scanner.nextInt();
                
                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score += 1;
                } else if (guess < targetNumber) {
                    System.out.println("Lower than the Targeted Number!You can Try again.");
                } else {
                    System.out.println("Higher than the Targeted Number!You can Try again.");
                }
                
                attempts += 1;
            }
            
            if (!guessedCorrectly) {
                System.out.println("Your attempts are done.The correct number was: " + targetNumber);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        
        System.out.println("Game over! Your score is: " + score);
        
        scanner.close();
    }
}
