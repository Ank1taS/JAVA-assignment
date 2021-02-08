/*
    programe    :   to covert a string to upper case without string method
    file name   :   ConvertUpper1.java
    date        :   14/10/2020
*/

import java.util.Scanner;

class ConvertUpper2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");  
        String str = sc.nextLine(); 
        String result = "";
        char temp;
        
        for(int i = 0; i < str.length(); ++i)
        {
            temp = str.charAt(i);
            if (temp <= 'z' && temp >= 'a')
            {
                temp = (char) (temp - 32);
            }
            result += temp;
        }

        System.out.println("String after converting each character to upper case :  " + result);
        sc.close();
    }
}
