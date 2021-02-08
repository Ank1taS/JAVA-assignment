/*
    programe name   :   to reverse a string
    file name       :   Reverse1.java
    date            :
*/

import java.util.Scanner;

class Reverse1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string - ");
        String str = sc.nextLine();

        System.out.println("Original string is = " + str);

        int size = str.length();
        char[] ch = new char[size];
        char[] arr1 = str.toCharArray();

        for (int i = size - 1, j = 0; i >= 0; --i, ++j)
        {
            ch[j] = arr1[i];
        }
        
        str = new String(ch);
        System.out.println("reversed string is = " + str);

        sc.close();
    }
    
}
