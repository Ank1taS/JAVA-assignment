/*
    programe    :   to covert a string to upper case without string method
    file name   :   ConvertUpper1.java
    date        :   14/10/2020
*/

import java.util.Scanner;

class ConvertUpper1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");  
        String str = sc.nextLine(); 

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; ++i)
        {
            if ((arr[i] >= 97 && arr[i] <= 122))
            {
                arr[i] = (char) (arr[i] - 32);
            }
        }

        str = String.valueOf(arr);
        System.out.println("String after converting each character to upper case :  " + str);
        sc.close();
    }
}
