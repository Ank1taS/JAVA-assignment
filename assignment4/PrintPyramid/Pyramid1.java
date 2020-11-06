// to print a pyramid

import java.util.Scanner;

class Pyramid1
{
    static void PrintPyramid(int n)
    {
        for(int i = 1; i <= n; ++i)
        {
            for (int sp = 0; sp <= n - i; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = i; j > 0; --j)
            {
                System.out.print(j);
            }
            for(int j = 2; j <= i; ++j)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; --i)
        {
            for (int sp = 0; sp <= n - i; ++sp)
            {
                System.out.print(" ");
            }
            for(int j = i; j > 0; --j)
            {
                System.out.print(j);
            }
            for(int j = 2; j <= i; ++j)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int line = input.nextInt();
        
        PrintPyramid(line);

        input.close();
    }
}