/* to find the greatest among 3 numbers (with nested if and command line argument)
    file name   : GreatestNum1.java
    date        : 7/9/20
*/

import java.lang.String;

class GreatestNum1 
{
    public static void main(String args[])
    {
        if(args.length != 3)    // args 
        {
            System.out.println("Invalid numbers of arguments..\n PROGRAME ENDS..");
            System.exit(1);
        }
//        int size = args[].length;

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        if(num1 > num2)
        {
            if(num1 > num3)
            {
                System.out.println("Greatest number is " + num1);
            }
            else
            {
                System.out.println("Greatest number is " + num3);

            }
        } 
        else
        {
            if(num2 > num3)
            {
                System.out.println("Greatest number is " + num2);
            }
            else
            {
                System.out.println("Greatest number is " + num3);

            }

        }
    }
}
