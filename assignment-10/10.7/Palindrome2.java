/*  programe    :   to check a string palindrome or not
    file name   :   Palindrome2.java
    date        :   15/10/2020
*/

import java.util.Scanner;

class Palindrome2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string =  ");
        String str = sc.nextLine();
        String strNew = "";
        char ch;
        
        for (int i = 0; i < str.length(); ++i)
        {
            ch = str.charAt(str.length() - i - 1);
            strNew += ch;
        }

        if(str.equals(strNew))
        {
            System.out.println(str + " is palindrome.");
        }
        else
        {
            System.out.println(str + " is not palindrome.");
        }

        sc.close();
    }    
}
