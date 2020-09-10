// to find the gcd of 2 numbers
// file name    : GCD1.java
// date         : 10/09/2020

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class GCD1 
{
    int calculateGCD(int n1, int n2)
    {
        int c ;
        while((c = n1 % n2) != 0)
        {
            n1 = n2;
            n2 = c;
        }
        return n2;
    }

    public static void main(String args[])throws IOException
    {
        BufferedReader inputBuf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number1 =  ");
        int num1 = Integer.parseInt(inputBuf.readLine());

        System.out.print("Enter number2 =  ");
        int num2 = Integer.parseInt(inputBuf.readLine());

        GCD1 obj = new GCD1();
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + obj.calculateGCD(num1, num2));
    }
    
}
