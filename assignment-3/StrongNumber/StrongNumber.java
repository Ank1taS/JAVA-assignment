// to check a number wheather a strong number or not
// file name    : StrongNumber.java
// date         : 10/9/2020

import java.util.Scanner;

class StrongNumber 
{
    int calculateStrong(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int factorial = 1;
            int rem = num % 10;
            for(int i = 1; i <= rem; ++i)
            {
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number =  ");
        int num1 = input.nextInt();

        StrongNumber obj = new StrongNumber();
        int num2 = obj.calculateStrong(num1);
        
        if(num1 == num2)
        {
            System.out.println(num2 + " is a strong number...");
        }
        else
        {
            System.out.println(num2 + " is not a strong number...");
        }
    }
    
}
