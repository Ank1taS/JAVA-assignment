// programe to print n numbers of fibonacy numbers
// fila name    : FibonacyNumers1.java
// date         : 10/09/2020

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FibonacyNumers1 
{
    static int x = 1, y = 0;
    
    static void printFibonacy()
    {
        System.out.println(y);
        y = x - y;
        x += y;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader inputBuf = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter n (To find first n fibonacy number) : ");
        int num = Integer.parseInt(inputBuf.readLine());


        System.out.println("\t\tFIBONACY SERIES Till " + num);
        for(int i = 0; i < num; ++i)
        {
            printFibonacy();

        }
    }    
}
