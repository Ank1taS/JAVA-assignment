// progame name : to calculate electric bill 
// filename     : ElectricBill1.java
// date         : 08/09/2020

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalculateBill
{
    int finalUnit ;
    int currentUnit;
    int restUnit;
    float price;
    float totalprice;

    CalculateBill(int unit)
    {
        finalUnit = unit;
        currentUnit = 50;
        restUnit = finalUnit - 50;
        price = 125;
        totalprice = 0;
    
    }


    float show()
    {

        System.out.println("Slot #1 \n\t 50 units \t\t\t\t" + price);
        totalprice += price;

        if(restUnit >= 100)
        {
            restUnit -= 100;
            price = 100 * (float)4.5;
            totalprice += price;


            System.out.println("Slot #2 \n\t 100 units \t\t\t\t" + price);

            if(restUnit >= 200)
            {
                restUnit -= 200;
                price = 200 * 6;
                totalprice += price;
                
                System.out.println("Slot #3 \n\t 200 units \t\t\t\t" + price);

                if(restUnit >= 300)
                {
                    price = 300 * (float)8.5;
                    totalprice += price;

                    restUnit -= 300;
                    System.out.println("Slot #4 \n\t 300 units \t\t\t\t" + price);

                    price = restUnit * 10;
                    totalprice += price;

                    System.out.println("Slot #5 \n\t " + restUnit +" units \t\t\t\t" + price);

                }
                else
                {
                    price = restUnit * (float)8.5;
                    totalprice += price;

                    System.out.println("Slot #4 \n\t 300 units \t\t\t\t" + price);
                }
            }
            else
            {
                price = restUnit * 6;
                totalprice += price;

                System.out.println("Slot #3 \n\t 200 units \t\t\t\t" + price);

            }
        }
        else 
        {
            price = restUnit * (float)4.5;
            totalprice += price;

            System.out.println("Slot #2 \n\t 100 units \t\t\t\t" + price);
        }
        return totalprice;
    }
}
class ElectricBill
{
    public static void main(String args[])throws IOException
    {
        float price;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(is);
 
        System.out.println("Enter the unit consumed = ");
        int units = Integer.parseInt(input.readLine());

        CalculateBill obj = new CalculateBill(units);
        System.out.println("\nTotal unit consumed = " + units);
        price = obj.show();
        System.out.println("---------------------------------------------------------");
        System.out.println("Total price \t\t\t\t\t" + price);
    }
}
