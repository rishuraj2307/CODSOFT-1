import java.util.*;

public class NumberGuessingGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("I AM THINKING OF A NUMBER BETWEEN 1 - 100");
        System.out.println("\nCAN YOU GUESS IT");

        int score = 0;
        boolean next = true;

        while(next){
            System.out.println("You Have Only 10 attempts.");
            int target = rand.nextInt(100);
            int attempts = 0;

            while(attempts < 10){
                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if(guess == target){
                    System.out.println("\nHurray !! You Won This Game In "+attempts+" Attempts.");
                    score ++;
                    break;
                }

                else if(guess < target){
                    System.out.println("\nToo Low, Try Again"); 
                }

                else{
                    System.out.println("\nToo High, Try Again");
                }

                if(attempts == 10){
                    System.out.println("\nYou Have Ran Out Of Attempts, The Correct Number was "+target+".");
                    break;
                }
            }
            System.out.print("\nDo you want to play again? (yes/no): ");
            String again = sc.next().toLowerCase();
            next = again.equals("yes");
        }
        System.out.println("\nThank you for playing! Your total score is: " + score);
        sc.close();
    }
}