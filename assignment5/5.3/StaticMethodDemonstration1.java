/* to demonstrate static methord

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Vehicle
{
    static String colour;

    static 
    {
        colour = "black";
    }
    
    static void getColour(String col)
    {
        colour = col;
    }
    static void Display()
    {
        System.out.println("Colour =  " + colour);
    }
}
class StaticMethodDemonstration1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter colour =  ");
        String colour = buf.readLine();
        
        if (!colour.equalsIgnoreCase("black"))
        {
            Vehicle.getColour(colour.toUpperCase());
        }

        Vehicle.Display();
    }    
}

