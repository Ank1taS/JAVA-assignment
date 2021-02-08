/*
    programe name   :   to reverse a string using stringBuilder
    file name       :   Reverse2.java
    date            :
*/

import java.lang.StringBuffer;
import java.util.Scanner;
class Reverse2 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string - ");
        StringBuffer str = new StringBuffer(sc.nextLine());

        System.out.println("Original string is = " + str);

        str.reverse();
        System.out.println("reversed string is = " + str);

        sc.close();
    }
}
