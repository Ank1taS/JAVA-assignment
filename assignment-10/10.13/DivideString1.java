/* 
    programe name   :   to divide a string in N equal parts
    file name       :   DivideString1.java
    date            :
*/

import java.util.Scanner;

class DivideString1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        System.out.println("length of string is = " + str.length());

        System.out.print("Enter N = ");
        int n = sc.nextInt();

        if(str.length() % n != 0)
        {
            System.out.print("string of length " + str.length() + " can not divided in " + n + " equal parts");
            sc.close();
            return;
        }
        else
        {
            int size = 0;
            int length = str.length() / n;

            for(int i = 0; i < n; ++i)
            {
                System.out.println(str.substring(size, size + length));
                size += length;
            }
        }
        sc.close();
    }
}
