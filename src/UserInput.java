import java.util.Scanner;

public class UserInput {
    public static void main (String[] args ){
        //make scanner variables for each input
        Scanner scanInt = new Scanner(System.in);
        Scanner scanLname = new Scanner(System.in);
        Scanner scanHouse = new Scanner(System.in);
        Scanner scanStrName = new Scanner(System.in);
        Scanner scanStrType = new Scanner(System.in);
        Scanner scanCity = new Scanner(System.in);

        //make variables to hold info
        String firstInitial, lastName;
        int houseNumber;
        String streetName, streetType, city;

        //prompt for input for each variable
        System.out.print("Enter first initial: \n");
        firstInitial = scanInt.next();
        System.out.print("Enter last name: \n");
        lastName = scanLname.next();
        System.out.print("Enter house number: \n");
        houseNumber = scanHouse.nextInt();
        System.out.print("Enter street name: \n");
        streetName = scanStrName.next();
        System.out.print("Enter street type: \n");
        streetType = scanStrType.next();
        System.out.print("Enter city: \n");
        city = scanCity.next();

        //output info
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

    }
}
