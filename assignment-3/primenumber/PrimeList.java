// programe to list primrs numbers betten 2 numbers
// file name    : PrimeList.java
// Date         : 09/09/2020

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PrimeList
{
    static boolean checkPrime(int n1)
    {
        int count = 0;
        for(int i = 1; i <= n1; ++i)
        {
            if(n1 % i == 0)
            {
                ++count;
            }
        }
        if(count == 2)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String args[])throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(is);

        System.out.println("Enter 1st number ");
        int num1 = Integer.parseInt(input.readLine());

        System.out.println("Enter 2st number ");
        int num2 = Integer.parseInt(input.readLine());

    //    PrimeList obj;
        System.out.println("List of primr numbers between " + num1 +" and " + num2);
        for(int i = num1; i < num2; ++i)
        {
            if(checkPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}