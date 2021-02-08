/* 
    programe name   :   to get max and min ocurrance of character in string
    file name       :   Occurance1.java
    date            :   15/10/2020
*/

import java.util.Scanner;

class Occurance1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string =  ");
        String str = sc.nextLine();

        char[] arr1 = str.toCharArray();
        int[] freq = new int[str.length()];
        int size = arr1.length;

        for (int i = 0; i < size; ++i)
        {
            for (int j = i + 1; j < size; ++j)
            {
                if (arr1[i] == arr1[j])
                {
                    ++freq[j];
                    ++freq[i]; 
                }
            }
        }

        int max = freq[0];
        int maxIndex = 0; 
        int min = freq[0];
        int minIndex = 0;
        for (int j = 1; j < size; ++j)
        {
            if (max < freq[j])
            {
                max = freq[j];
                maxIndex = j;
            }
            if (min > freq[j])
            {
                min = freq[j];
                minIndex = j;
            }
        }

        System.out.print("Max occuring character in string is : " + arr1[maxIndex]);
        System.out.println("\nMin occuring character in string is : " + arr1[minIndex]);

        sc.close();
    }
}
