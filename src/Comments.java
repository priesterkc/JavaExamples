/*
*Comments Program
*Kenisha Priester
* January 22, 2019
 */

import java.util.Random;
import java.util.Scanner;

public class Comments {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //initilize the range of random numbers (between 1-100)
        //pull a random number
        Random random = new Random();
        int from = 1;
        int to = 100;
        int randomNumber = random.nextInt(to - from  + 1) + from;

        //set the guessed number to zero as a placeholder
        int guessedNumber = 0;

        //let the player know the range that the guessed number could be in
        System.out.printf("The number is between %d and %d.\n", from, to);

        //ask player for their guess
        //check if the guess is higher or lower than the random number
        //let player know if number is high, low, or correct
        //player will stay in loop to make guesses until they get it correct
        do {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber)
                System.out.println("Your guess is too high!");
            else if (guessedNumber < randomNumber)
                System.out.println("Your guess is too low!");
            else
                System.out.println("You got it!");
        } while (guessedNumber != randomNumber);
    }
}
