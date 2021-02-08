/*
    programe name   :   to create string of vowel and consonants of a string 
    file name       :   AlphabateString.java
    date            :   14/10/2020
*/

import java.util.Scanner;

class AlphabateString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string =  ");
        String str = sc.nextLine();

        // converting string to char array
        int size = str.length();

        char[] vowel = new char[size];
        int vowelSize = 0;
        char[] consonant = new char[size];
        int consonantSize = 0;

        for (int i = 0; i < size; ++i)
        {
            char ch = str.charAt(i);

            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    vowel[vowelSize] = ch;
                    ++vowelSize;
                }
                else
                {
                    consonant[consonantSize] = ch;
                    ++consonantSize;
                }
            }
        }
        String vowelStr = new String(vowel);
        String consonantStr = new String(consonant);

        System.out.print("consonant string  = " + consonantStr + "\nvowel string = " + vowelStr);
        sc.close();
    }  
}
