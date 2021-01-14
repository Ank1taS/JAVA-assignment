// programe to list prime numbers between 2 numbers(declaring obj of main class)
// file name    : PrimeList1.java
// Date         : 09/09/2020

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class PrimeList1
{
    void checkPrime(int n1, int n2)
    {
        System.out.println("Prime numbers are :");
        for(int i = n1; i <= n2; ++i)
        {       
            int count = 0;

            for(int j = 1; j <= i; ++j)
            {
                if( i % j == 0)
                {
                    ++count;
                }
            }
            if(count == 2)
            {
                System.out.println(i);
            }
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

        PrimeList obj = new PrimeList();

        obj.checkPrime(num1, num2);
    }
}
