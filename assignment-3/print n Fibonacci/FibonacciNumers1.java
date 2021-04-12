// programe to print n numbers of fibonacy numbers
// fila name    : FibonacyNumers1.java
// date         : 10/09/2020

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FibonacciNumbers1 
{
    static int x = 1, y = 0;
    
    static void printFibonacci()
    {
        System.out.println(y);
        y = x - y;
        x += y;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader inputBuf = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter n (To find first n fibonacci number) : ");
        int num = Integer.parseInt(inputBuf.readLine());


        System.out.println("\t\tFIBONACCI SERIES TILL " + num);
        for(int i = 0; i < num; ++i)
        {
            printFibonacci();

        }
    }    
}
