/*
    programe name   :   Square class inherits Rectangle while rectrangle inherits Shape class . to implimant 
                        dynamic dispatch and methord overriding and find area and perimiter of both figure.
    file name       :   ShapeMain1.java
    date            :
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Shape
{
    void display()
    {
        System.out.println("Shape class Display");
    }
}

class Rectrangle extends Shape
{
    float side1;
    float side2;

    Rectrangle()
    { }

    Rectrangle(float side1, float side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    void display()
    {
        System.out.println("Perimeter of rectangle = " + 2 *(side1 + side2));
        System.out.println("area of rectangle = " + (side1 * side2));
    }
}

class Square extends Rectrangle
{
    float side1;

    Square(float side1)
    {
        this.side1 = side1;  
    }
  
    void display()
    {
        System.out.println("Perimeter of square = " + (4 * side1 ));
        System.out.println("area of square = " + (side1 * side1));
    }
}


class ShapeMain1 
{
    public static void main(String[] args) throws IOException
    {
        float side1, side2;

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        Shape obj;

        // for rectangle
        System.out.print("For Rectangle \nEnter side1 = ");
        side1 = Float.parseFloat(buf.readLine());
        System.out.print("Enter side2 = ");
        side2 = Float.parseFloat(buf.readLine());

        obj = new Rectrangle(side1, side2);
        obj.display();

        // for square
        System.out.print("For square \nEnter side1 = ");
        side2 = Float.parseFloat(buf.readLine());

        obj = new Square(side2);
        obj.display();
    }
}
