import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterator {

    public static void main(String[] args)
    {
        //create a list of names
        List<String> names = new ArrayList<String>();

        //add names to list
        names.add("Eve");
        names.add("Anna");
        names.add("Tonny");
        names.add("Steve");

        //method 1: Iterate using For loop
        System.out.println("Using for loop");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        //method 2: Iterate using advanced For loop
        System.out.println("Using advanced For loop");
        for (String name : names) {
            System.out.println(name);
        }

        //method 3: Iterate using advanced For loop
        System.out.println("Using Iterator");
        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //method 4: Iterate using While loop
        System.out.println("Using While loop");
        int index = 0;
        while (names.size() > index)
        {
            System.out.println(names.get(index));
            index++;
        }
    }
}
