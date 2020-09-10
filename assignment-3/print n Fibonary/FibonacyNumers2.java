// programe to print n numbers of fibonacy numbers
// fila name    : FibonacyNumers2.java
// date         : 10/09/2020

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FibonacyNumers2
{   
    void printFibonacy(int n)
    {
        int x = 1, y = 0;
        for(int i = 0; i < n; ++i)
        {
            System.out.println(y);
            y = x - y;
            x += y;
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader inputBuf = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter n (To find first n fibonacy number) : ");
        int num = Integer.parseInt(inputBuf.readLine());

        FibonacyNumers2 obj = new FibonacyNumers2();

        System.out.println("\t\tFIBONACY SERIES Till " + num);
        obj.printFibonacy(num);

    }    
}
