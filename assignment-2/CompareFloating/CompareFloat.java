// to compare 2 floating point numbers up to 3 decimal number
// file name   : CompareFloat.java

import java.util.Scanner;

class FTI
{
    int temp1, temp2;

    void compare(float n1, float n2)
    {
        temp1 = (int) n1;
        temp2 = (int) n2;

        if(temp1 != temp2)
        {
            if(temp1 > temp2)
            {
                System.out.println(n1 + " > " +n2);
            }
            else
            {
                System.out.println( n1 + " < " + n2);
            }
        }
        else
        {
            float num1 = n1 * 1000;
            float num2 = n2 * 1000;
            
            temp1 = (int) num1;
            temp2 = (int) num2;

            if(temp1 != temp2)
            {
                if(temp1 > temp2)
                {
                    System.out.println(n1 + " > " +n2);
                }
                else
                {
                    System.out.println( n1 + " < " + n2);
                }      
            }
            else
            {
                System.out.println(n1 + " = " + n2);
            }
        }
    }
}

class CompareFloat 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number 1 ");
        float num1 = input.nextFloat();

        System.out.println("Enter number 2 ");
        float num2 = input.nextFloat();

        FTI obj = new FTI();
        obj.compare(num1, num2);

        input.close();
    }
}
