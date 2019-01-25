public class Application {

    public static void main(String args[])
    {
        boolean isFixed = false;

        //execute the callPlumber method (function)
        isFixed = callPlumber();

        if (isFixed)
        {
            System.out.println( "Thank goodness the drain is fixed.");
        }
        else {
            System.out.println( "Ugh, the drain is still leaking." );
        }
    }

    private static boolean callPlumber()
    {
        //code that won't run until it's called
        //hides in background

        //calculate cost method take two parameters but doesn't return a value
        String customer = "Mr. Fix-It";
        String repairs = "fixed drain";
        double labor_hours = 1.5;
        double materials_cost = 0.75;

        //this method calls another method
        GenerateInvoice(customer, repairs, labor_hours, materials_cost);

        return true;
    }

    private static void GenerateInvoice(String customer, String repairs, double labor, double materials)
    {
        //calculates cost and invoice
        double hourlyRate = 99.0;
        double cost = (hourlyRate * labor) + materials;

        System.out.println( " --- Invoice --- " );
        System.out.println( "Customer: " + customer);
        System.out.println("Repairs: " + repairs);
        System.out.println("Cost: " + cost);
        System.out.println(); //prints blank line
    }
}
