/*
    programe name   :   to check 2 strings are anagram or not
    file name       :   Anagram1.java
    date            :   14/10/2020
*/

import java.util.Scanner;
import java.util.Arrays;

class Anagram1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");  
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");  
        String str2 = sc.nextLine();

        if (str1.length() != str2.length())
        {
            System.out.println("Strings are not anagram.");
            sc.close();
            return;
        }

        // converting string to char array
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // sorting both the char array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // comparing arrays
        if (Arrays.equals(arr1, arr2))
        {
            System.out.println("Strings are anagram.");
        }
        else
        {
            System.out.println("Strings are not anagram.");
        }
        sc.close();
    }
}
