/* programe name    :   to count the total numbers of character in a string
    file            :   CountCharacter1.java
    date            :   14/10/2020
*/

import java.util.Scanner;

class CountCharacter1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");  
        String str= sc.nextLine();

        // converting string to character array
        char[] arrChar = str.toCharArray();
        int count = 0;

        for(int i : arrChar)
        {
            count++;
        }

        System.out.print("Total numbers of characters are = " + count);
        sc.close();
    }    
}
