// to print the pascal triangle taking line number as input
// file name    : PascalTriangle1.java
// date         : 15/09/2020

// formula for nth term of pascal triangle : (n / k) = ((n!) / ((k!) * (n - k)))
//                                           where n = n is row number
//                                                 k = is term of that row

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PascalTriangle1
{
    static int factorial(int n)
    {
        int fact = 1;
        
        while(n != 0)
        {
            fact *= n;
            --n;
        }

        // return factorial of the parameter
        return fact;
    } 

    public static void main(String args[]) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the numbers of lines =  ");
        int num = Integer.parseInt(input.readLine());

        // row operations
        for(int row = 0; row < num; ++row)
        {
            // print 3 space
            for(int sp = row; sp < num; ++sp)
            {
                System.out.print("   ");
            }

            //print term of the row
            for(int pos = 0; pos <= row; ++pos)
            {
                System.out.printf("%6d",factorial(row) / (factorial(pos) * factorial(row - pos)));
            }

            System.out.println();
        }
    }
}