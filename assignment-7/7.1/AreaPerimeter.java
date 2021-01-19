/*
    programe name   :   To create abstract class "Shape" with abstract methods and find area and perimeter of 
                        rectangle, square and circle where they extends Shape class.
    file name       :   AreaPerimeter.java
    date            :   5/10/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// abstact class Shape
abstract class Shape
{
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape
{
    float side1, side2;

    Rectangle(float side1, float side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    double perimeter()
    {
        return (2 * (side1 + side2));
    }

    double area()
    {
        return (side1 * side2);
    }
}

class Square extends Shape
{
    float side;

    Square(float side)
    {
        this.side = side;
    }

    double perimeter()
    {
        return (4 * side);
    }

    double area()
    {
        return (side * side);
    }
}

class Circle extends Shape
{
    float radious;

    Circle(float radious)
    {
        this.radious = radious;
    }

    double perimeter()
    {
        return (2 * Math.PI * radious);
    }

    double area()
    {
        return (Math.PI * (radious * radious));
    }
}

class AreaPerimeter
{
    public static void main(String[] args)throws IOException
    {
        float side1, side2;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Shape obj;

        // for rectangle
        System.out.println("\tRECTANGLE");
        System.out.print("side1  ");
        side1 = Float.parseFloat(buf.readLine());
        System.out.print("side2  ");
        side2 = Float.parseFloat(buf.readLine());

        obj = new Rectangle(side1, side2);
        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area());
        

        // for square
        System.out.println("\n\tSQUARE");
        System.out.print("side  ");
        side1 = Float.parseFloat(buf.readLine());

        obj = new Square(side1);
        System.out.println("Perimeter = " + obj.perimeter());
        System.out.println("Area = " + obj.area());

        // for circle
        System.out.println("\n\tCIRCLE");
        System.out.print("radious  ");
        side1 = Float.parseFloat(buf.readLine());

        obj = new Circle(side1);
        System.out.printf("Perimeter = %.4f", obj.perimeter());
        System.out.printf("\nArea = %.4f", obj.area()); 
    }
}
