/*
programe name   :   To take input as run time and find frequency of each 
                    element of array
filename        :   ArrayInput1.java
date            :   12/10/2020
*/

import java.util.Scanner;

public class ArrayInput1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array: ");
        int size = sc.nextInt();

        int[] buffer = new int[size];
        System.out.println("Enter the elements:");

        for(int i = 0; i < buffer.length; i++)
            buffer[i] = sc.nextInt();

        boolean[] freq = new boolean[size];
        System.out.println("Frequency of each element: ");

        for(int i = 0; i < buffer.length; i++) 
        {
            if (freq[i] == true) {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < buffer.length; j++) 
            {
                if (buffer[i] == buffer[j]) 
                {
                    count++;
                    freq[j] = true;
                }
            }

            System.out.println("Frequency of  " + buffer[i] + " - " + count);
        }

        sc.close();
    }
}
