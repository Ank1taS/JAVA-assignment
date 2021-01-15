/*
    to create a Vehicle Class with required properties . static varriables
    are initialised through static methord

    file    : VehiclePrograme1.java
    date    : 23/09/2020
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Vehicle
{
    String chesisNo;
    String engineNo;
    static String colour;
    String model;
    String varriant;
    String brand; 

    static 
    {
        colour = "black";
    }
    
    Vehicle(String cNo, String eng, String mod, String var, String bran)
    {
        chesisNo = cNo;
        engineNo = eng;
        model = mod;
        varriant = var;
        brand = bran;
    }
    static void getColour(String col)
    {
        colour = col;
    }
    void Display()
    {
        System.out.println("Chesis number =  " + chesisNo);
        System.out.println("engine number =  " + engineNo);
        System.out.println("model =  " + model);
        System.out.println("varriant =  " + varriant);
        System.out.println("brand =  " + brand);
        System.out.println("Colour =  " + colour);
    }
}
class VehiclePrograme1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Chesis number =  ");
        String chesisNo = buf.readLine();
        System.out.print("Enter engine number =  ");
        String engineNo = buf.readLine();
        System.out.print("Enter model =  ");
        String model = buf.readLine();
        System.out.print("Enter varriant =  ");
        String varriant = buf.readLine();
        System.out.print("Enter brand =  ");
        String brand = buf.readLine(); 
        Vehicle obj = new Vehicle(chesisNo, engineNo, model, varriant, brand);

        System.out.print("Enter colour =  ");
        String colour = buf.readLine();
        if (!colour.equalsIgnoreCase("black"))
        {
            Vehicle.getColour(colour.toUpperCase());
        }

        obj.Display();
    }    
}
