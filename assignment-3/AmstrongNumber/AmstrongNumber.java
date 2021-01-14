// to check wheather a number is  amstrong or not
// file name    : AmstrongNumber.java
// date         : 9/9/20

import java.util.Scanner;

class AmstrongNumber 
{
    static boolean checknum(int num)
    {
        int rem, sum = 0;
        int number = num;
        while(number != 0)
        {
            rem = number % 10;
            sum += Math.pow(rem, 3);
            number /= 10;
        }
        if(sum == num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = input.nextInt();

        if(checknum(num))
        {
            System.out.println(num + " is an amstrong number.");
        }
        else
        {
            System.out.println(num + " is not an amstrong number.");
        }
    }
}
