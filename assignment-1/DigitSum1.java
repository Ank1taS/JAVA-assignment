// programe to find the sum of digits of a 4 digit number
// file name    :   DigitSum1.java
// date         :   1/9/20

import java.util.Scanner;

class AddDigit
{
    int sum;

    AddDigit(int num)
    {
        sum = num % 10;
        sum = sum + (num / 10) % 10;
        sum = sum + (num / 100) % 10;
        sum = sum + num / 1000;
     //   System.out.println("Sum of digits of " + num + " = " + sum);
    }

    void show(int num)
    {
        System.out.println("Sum of digits of " + num + " = " + sum);

    }
}

public class DigitSum1
{
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 4 digit number = ");
        int num = input.nextInt();

        AddDigit obj = new AddDigit(num);
        obj.show(num);

        input.close();
    }
}
