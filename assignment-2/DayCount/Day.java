// programe name    : to find the days in a month where years and month are input
// file name        : Day.java
// date             : 9/9/20

import java.util.Scanner;

class Calculate
{
    int year;
    int month;

    Calculate(int n1, int n2)
    {
        year = n1;
        month = n2;
    }

    boolean leap()
    {
        boolean result =(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? true : false;
        return result;
    }

    void show()
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println("Total days in the moth of " + month + " and " + year + " are  31.");
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("Total days in the moth of " + month + " and " + year + " are  30.");
        } 
        else    //for february month
        {
            if(leap())
            {
                System.out.println("Total days in the moth of " + month + " and " + year + " are  29.");
 
            }
            else
            {
                System.out.println("Total days in the moth of " + month + " and " + year + " are  28.");

            }
        }
    }
}
class Day 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // taking inputs
        System.out.println("Enter year [in digits] = ");
        int year = input.nextInt();
        System.out.println("Enter month [in digits] = ");
        int month = input.nextInt();

        //creating claculate class object
        Calculate obj = new Calculate(year, month);
        obj.show();

        input.close();
    }
    
}
