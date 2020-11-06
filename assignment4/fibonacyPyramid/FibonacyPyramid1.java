// to print a pyramid of fibonacy series

import java.util.Scanner;

class FibonacyPyramid1 
{
    static void printFibonacy(int n)
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

        System.out.println("Enter the numbers of lines : ");
        int linenum = input.nextInt();

        System.out.println("  PYRAMID \n ");
        for(int i = 1; i < linenum + 1; ++i)
        {
            printFibonacy(i);
        }
        input.close();
    } 
    
}
