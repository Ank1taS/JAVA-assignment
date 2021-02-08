/*
    programe name   :   to print max occured word in string
    file name       :   MaxWord1.java
    date            :   15/10/2020
*/

import java.util.Scanner;

class MaxWord1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string =  ");
        String str = sc.nextLine();

        String[] strSplit = str.split(" ");
        int[] freq = new int[strSplit.length];

        for (int i = 0; i < strSplit.length; ++i)
        {
            for (int j = i + 1; j < strSplit.length; ++j)
            {
                if (strSplit[i].equals(strSplit[j]))
                {  
                    ++freq[j];
                    ++freq[i]; 
                }
            }
        }
        int max = freq[0];
        int maxIndex = 0; 

        for (int j = 1; j < strSplit.length; ++j)
        {
            if (max < freq[j])
            {
                max = freq[j];
                maxIndex = j;
            }
        }
        System.out.print("Max occuring word in string is : " + strSplit[maxIndex]);

        sc.close();
    }
}
