/*
    programe name   :   to remove all the white space present in a string
    file name       :   RemoveSpace1.java
    date            :   14/10/2020
*/

import java.util.Scanner;
import java.lang.String;

class RemoveSpace1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string =  ");
        String str = sc.nextLine();

        str = str.replace(" ", "");

        System.out.println("string after removal of all white space = " + str);
        sc.close();
    }
}
