// programe to convert fahrenheit to celcius
// file name    :   ConverTemp1.java
// date         :   1/9/20


import java.util.Scanner;
//import java.text.Format;

class FahrenheitToCelcius
{
    double celcius;

    FahrenheitToCelcius(Float fahrenheit)
    {
        celcius = (fahrenheit - 32) * (5.0 / 9);
     //   DecimalFormat df = new DecimalFormat("#.##");
    }
    void show(float fahrenheit)
    {
        System.out.println(fahrenheit + " F = " + celcius + " c" );
    }
}

public class ConvertTemp1 
{
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in fahrenheit = ");
        float temp = input.nextFloat();

        FahrenheitToCelcius obj = new FahrenheitToCelcius(temp);
        obj.show(temp);

        input.close();
    }
    
}
