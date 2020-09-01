// to find the greatest number among 3 numbers
// file name    : GreatestNo1.java

import java.util.Scanner;

class GreatestNo1 
{

    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers = ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int greatestNum = ((num1 > num2) && (num1 > num3)) ? num1 : (((num2 > num1) && (num2 > num3)) ? num2 : num3);

        System.out.println("Greatest number is = " + greatestNum);

        input.close();
    }
}