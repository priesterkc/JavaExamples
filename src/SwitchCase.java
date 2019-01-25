import java.util.Scanner;

public class SwitchCase {

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        //code for user input
        //assign input to 'days' variable
        System.out.println( "Enter the number of days: " );
        int days = scan.nextInt();

        //make switch case for months with corresponding days
        //String monthDays;
        switch (days)
        {
            case 28: //monthDays = "February";
                System.out.println("February");
                    break;
            case 30: //monthDays = "April, June, September, November";
                System.out.println( "April, June, September, November");
                    break;
            case 31: //monthDays = "January, March, May, July, August, October, December";
                     System.out.println( "January, March, May, July, August, October, December" );
                    break;
            default: //monthDays = "Unknown";
                     System.out.printf( "There are no months with %d days", days );
                    break;
                //System.out.printf( "There are no months with %d days", days);
        }

        //System.out.println(monthDays);
    }
}
