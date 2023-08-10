import java.util.Scanner;
import java.lang.Math;
public class NumberGuessingGame {
    public static void main(String[] args) {

        int random_gen = (int)(Math.random() * 100) + 1;  // to generate a random number between 1 and 100

        System.out.println("Hii! I am your host. I am thinking of a number between 1 and 100.\n Your task is simple. \n You have to guess what number I am thinking\nYou have 5 tries to guess the number.\n Good Luck <3");

        int trials = 5;   // number of trials for the user

        boolean right_ans = false;   // TO check if the user has guessed the number

        Scanner sc = new Scanner(System.in);

        while (trials > 0)
        {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == random_gen)  // if the user guesses correctly
            {
                System.out.println("Congratulations! You have guessed the number correctly!\nYou win!");
                right_ans=true;
                break;
            }

            // after each trial decrease the number of trials by 1

            else if (guess > random_gen)  // if the user guesses greater than the number
            {
                System.out.println("Your guess is too high.\nYou have " + (trials - 1) + " tries left.");
                trials--;
            }

            else   // if the user guesses less than the number
            {
                System.out.println("Your guess is too low.\nYou have " + (trials - 1) + " tries left.");
                trials--;
            }

        }

        // if the user has not guessed correctly and run out of trials
        if (right_ans == false) {
            System.out.println("You ran out of tries.\nYou lose!");
        }
    }
}