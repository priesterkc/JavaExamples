import java.util.Random;

public class Arrays {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int randomInt;

        //declare array to hold ten test scores
        int scores[] = new int[10];

        //initialize elements of an array
        for (int i = 0; i < 10; i++)
        {
            randomInt = 1 + rnd.nextInt(100);   //create random number between 1-100
            scores[i] = randomInt;
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.printf( "Element # %d is %d\n", i, scores[i] );
        }

        //print the fifth element
        System.out.println( "The fifth element is " + scores[4] );

        //print every other element
        for (int i = 0; i < 10; i += 2)
        {
            System.out.printf( "Score %s is %d\n", i, scores[i]);
        }

        //print the number of elements
        System.out.println( "The array length is " + scores.length);

        //change an element
        scores[0] = 100;
        System.out.println( "The first element is now 100" );

        //this line will not generate the ArrayIndexOutOfBoundsException
        //Exception handling will be covered soon
        try {
            System.out.println( scores[10] );
        }
        catch(Exception e){
            System.out.println( "We caught the ArrayIndexOutOfBoundsException error" );
        }

        //this will generate an ArrayIndexOutOfBoundsException
        //since we did not wrap it in the try->catch error for error handling
        System.out.println( scores[10] );
    }
}
