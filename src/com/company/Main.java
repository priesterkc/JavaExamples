package com.company;

public class Main {

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        System.out.println("Start Time: " + startTime);
        //string is recommended if you don't plan to modify contents
        //of your variable very often
        //String s= "Dave";
        //StringBuilder is faster but not good for multi-threaded applications
        //where you are performing two or more tasks simultaneously
        StringBuilder s = new StringBuilder("Dave");

        //StringBuffer is good for multi-threaded applications
        //where you are performing two or more tasks simultaneously
        //StringBuffer s = new StringBuffer("Dave");

        //perform a bunch of operations on the string to see the difference in the time
        for(int i=0; i<50000; i++)
        {
            //s += " Wolf";
            //s.append(" Wolf");
            System.out.println(s);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total time ====== " + (endTime - startTime));
    }
}
