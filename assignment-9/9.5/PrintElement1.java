/*  programe name   :   to find the 2nd smallest and 3rd largest elemnts of array
    file name       :   PrintElement1.java
    date
*/

import java.util.Scanner;
import java.util.Arrays;

class PrintElement1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element - ");

        for (int i = 0; i < size; ++i)
        {
            arr[i] = sc.nextInt();
        }

        // display 
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }

        Arrays.sort(arr);
        int[] temp = new int[size];
        int tempSize = 1;
        temp[0] = arr[0];

        // to remove duplicacy
        for (int i = 1; i < size; ++i)
        {        
            boolean found = false;

            for (int j = 0; j < tempSize; ++j)
            {
                if (arr[i] == temp[j])
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {           
                temp[tempSize] = arr[i];
                ++tempSize;
            }
        }

        // to get 2nd smallest number
        if (tempSize < 2)
        {
            System.out.print("\nno 2nd smallest number in array");
        }
        else
        {
            System.out.print("\n2nd smallest = " + temp[1]);
        }

        // to get 3rd largest number
        if (tempSize < 3)
        {
            System.out.print("\nno 3rd largest number in array");
        }
        else
        {        
            System.out.print("\n3rd largest = " + temp[tempSize - 3]);
        }

        sc.close();
    }
}
