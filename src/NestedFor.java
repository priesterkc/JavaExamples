public class NestedFor {

    static final int MAX = 9;

    public static void main(String args[])
    {
        int row, col;

        for (row = 1; row <= MAX; row++)
        {
            //print out the row num the number of times the row num is
            for (col = 1; col <= row; col++)
            {
                System.out.print(row + "\t");
            }
            System.out.println(); // go to next line
        }
    }
}
