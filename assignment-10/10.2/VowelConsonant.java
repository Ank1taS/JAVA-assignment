/*
    programe name   :   to count numbers of vowel and consonant 
    file name       :   VowelConsonant1.java
    date            :   14/10/2020
*/

import java.util.Scanner;

class VowelConsonant 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string =  ");
        String str = sc.nextLine();

        // converting string to char array
        str = str.toLowerCase();
        int size = str.length();

        int countVowel = 0;
        int countConsonant =0;

        for (int i = 0; i < size; ++i)
        {
            char ch = str.charAt(i);

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    ++countVowel;
                }
                else
                {
                    ++countConsonant;
                }
            }
        }

        System.out.print("Total vowel = " + countVowel + "\n" + "Total consonant = " + countConsonant);
        sc.close();
    }
}
