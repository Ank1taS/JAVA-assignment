/*
programe to find the roots of a quadratic equation
file  : Roots1.java
date  : 07/09/2020
*/

import java.util.Scanner;

class Roots1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a = ");
        int a = input.nextInt();
        System.out.println("Enter b = ");
        int b = input.nextInt();
        System.out.println("Enter c = ");
        int c = input.nextInt();

        System.out.println("equation is = " + a + "X^2 + " + b +"X + " + c);

        int d = (b * b) - (4 * a * c);

        if(d == 0)
        {
            System.out.println("\n the above equation have only one root .\n it is = " + (-b /(2 * a)));
        }

        else if(d > 0)
        {
            System.out.println("\n the above equation have 2 roots.\n they are , X1 = " + 
            (-b + Math.sqrt(d)) / (2 * a) + " and  X2 = " + (-b - Math.sqrt(d)) / (2 * a));
        }
        else
        {
           System.out.println("\n the above equation have imaginary roots");
        }
        input.close();
    }
}
