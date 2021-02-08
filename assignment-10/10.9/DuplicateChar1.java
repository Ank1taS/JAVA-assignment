/* programe name    : to find the duplicate character in string
    file name       : DuplicateChar1.java
    date            : 14/10/2020
*/

import java.util.Scanner;

class DuplicateChar1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");  
        String str= sc.nextLine(); 

        char[] arr1 = str.toCharArray();
        char[] temp = new char[str.length()];
        int index = 0;
        boolean checkFlag;

        System.out.print("repeted character(s) are : ");

        for(int i = 0; i < arr1.length; ++i) 
        {
            checkFlag = false;

            for (int j = 0; j < temp.length; ++j)
            {
                if (arr1[i] == temp[j])
                {
                    checkFlag = true;
                    break;
                }
            }

            if (! checkFlag)
            {
                for (int j = i + 1; j < str.length(); ++j) 
                {
                    if (arr1[i] == arr1[j] && arr1[i] != 32) 
                    {
                        temp[index] = arr1[i];
                        ++index;
                        break;
                    }
                }
            } 
        }

        for (int i = 0; i <= index; ++i)
        {
            System.out.print(temp[i] + "  ");
        }
        
        sc.close();
    }
}