// programe to find the sum of first and last digit of a 5 digit number
// file name    :   FirstLastSum1.java
// date         :   1/9/20

import java.util.Scanner;

class AddFirstLast
{
    int sum;

    AddFirstLast(int num)
    {
        sum = num % 10;
        sum = sum + (num / (int)( Math.pow(10, 4))) ;

    }
    void show(int num)
    {
        System.out.println("Sum of 1st and last digit of " + num + " = " + sum);

    }
}

public class FirstLastSum1
{
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit number = ");
        int num = input.nextInt();

        AddFirstLast obj = new AddFirstLast(num);
        obj.show(num);

        input.close();
    }
}
