// to print the floid's triangle

import java.util.Scanner;

class FloidsTriangle1 
{
    static void printPyramid(int n)
    {
        int count = 0;
        for(int i = 1; i <= n; ++i)
        {
            for(int j = 0; j < i; ++j)
            {
                count += 1; 
                System.out.print(count + " ");
            }
            System.out.println();
        }
    } 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers of lines : ");
        int linenum = input.nextInt();

        System.out.println("========= Floid's PYRAMID =========\n ");
        printPyramid(linenum);
  
    }
}
