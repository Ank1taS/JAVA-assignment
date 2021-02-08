/*
    programe name   :   to swap 2 strings without 3rd varriable
    file name       :   Swap1.java
    date            :
*/

import java.util.Scanner;

class Swap1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1 -  ");
        String str1 = sc.nextLine();
        System.out.print("Enter string2 -  ");
        String str2 = sc.nextLine();

        int size1 = str1.length();

        System.out.print("\tBefore swap ,\nstring1 = " + str1 + "\nstring2 = " + str2);

        str1 = str1.concat(str2);
        str2 = str1.substring(0, size1);
        str1 = str1.substring(size1);

        System.out.print("\n\tAfter swap ,\nstring1 = " + str1 + "\nstring2 = " + str2);

        sc.close();
    }
}
