/*
    to design bank class with require data member n method and constructor
    which is inherited by SBI, ICIC .
    filename    :   Inheritance1.java
    date        :   28/ 09/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bank
{
    String name;
    String ID;
    static String acType;

    Bank(String name, String ID)
    {
        this.name = name;
        this.ID = ID;
    }

    static
    {
        acType = "Lone ac";
    }

    double rateOfInterest()
    {
        return 0;
    }

    void display()
    {
        System.out.println("rate of interest = " + rateOfInterest());
        System.out.println("A/C type  = " + acType);
        System.out.println("A/C number = " + ID);
        System.out.println("A/C holder = " + name);
    }
}

class SBI extends Bank
{
    SBI(String name, String ID)
    {
        super(name, ID);
    }

    double rateOfInterest()
    {
        return (15.5);
    }
}

class ICICI extends Bank
{
    ICICI(String name, String ID)
    {
        super(name, ID);
    }

    double rateOfInterest()
    {
        return (12.5);
    }
}

class Inheritance1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String id , name;

        System.out.println("    SBI ");
        System.out.print("Enter A/C number =  ");
        id = buf.readLine();
        System.out.print("Enter A/C holder =  ");
        name = buf.readLine();

        SBI obj1 = new SBI(name, id);
        obj1.display();

        System.out.println("   ICICI ");
        System.out.print("Enter A/C number =  ");
        id = buf.readLine();
        System.out.print("Enter A/C holder =  ");
        name = buf.readLine();

        ICICI obj2 = new ICICI(name, id);
        obj2.display();
    }
}
