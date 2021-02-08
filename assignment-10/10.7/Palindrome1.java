/*  programe    :   to check a string palindrome or not
    file name   :   Palindrome1.java
    date        :   15/10/2020
*/

import java.util.Scanner;

class Palindrome1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string =  ");
        String str = sc.nextLine();

        // converting to char[]
        char[] arr = str.toCharArray();
        int size = arr.length;
        int i = 0;

        while(true)
        {
            if (i == size / 2)
            {
                break;
            }

            if (arr[i] != arr[size - i - 1])
            {
                System.out.println(str + " is not palindrome.");
                sc.close();
                return;
            }

            ++i;
        }

        System.out.println(str + " is palindrome.");
        sc.close();
    } 
}
