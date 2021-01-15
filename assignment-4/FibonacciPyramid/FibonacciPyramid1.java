// to print a pyramid of fibonacci series

import java.util.Scanner;

class FibonacciPyramid1 
{
    static void printFibonacci(int n)
    {
        int x = 1, y = 0;
        
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(y + " ");
            y = x - y;
            x += y;
        }

        System.out.print("\n");
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of lines : ");
        int linenum = input.nextInt();

        System.out.println("  PYRAMID\n");
        for(int i = 1; i < linenum + 1; ++i)
        {
            printFibonacci(i);
        }

        input.close();
    }   
}
