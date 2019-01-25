import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args)
    {
        Scanner wordInput = new Scanner(System.in);
        Scanner indexInput = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = wordInput.next();

        System.out.println("Enter a number as a index: ");
        int index = indexInput.nextInt();

        if ( index > word.length() )
            System.out.println("Index is larger than length.");
        else {
            System.out.println("The length of " + word + " is: " + word.length());
            System.out.println("The substring from 0 to " + index + " is: " + word.substring(0,index));
        }
    }
}
