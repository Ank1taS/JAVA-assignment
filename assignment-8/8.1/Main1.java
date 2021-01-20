/*
    programe name   :   To create an interface "Shape" with 2 abstract methods area(), perimeter(). Classes
                        Circle, Square, Rectangle impliment "Shape". to impliment it by performing operation on 
                        objects of different classes. 
    file name       :   Main1.java
    date            :
*/

import shape.*;
import java.util.Scanner;

class Main1
{
    public static void main(String[] args)
    {
        float n1, n2;

        Scanner sc = new Scanner(System.in);
        Shape obj;

        System.out.print("Enter radious of Circle = ");
        n1 = sc.nextFloat();
        obj = new Circle(n1);
        System.out.printf("Perimeter = %.3f", obj.perimeter());
        System.out.printf("\narea = %.3f", obj.area());

        System.out.print("\nEnter length of rectangle = ");
        n1 = sc.nextFloat();
        System.out.print("Enter breadth of rectangle = ");
        n2 = sc.nextFloat();
        obj = new Rectangle(n1, n2);
        System.out.printf("Perimeter = %.3f", obj.perimeter());
        System.out.printf("\narea = %.3f", obj.area());

        System.out.print("\nEnter side of square = ");
        n1 = sc.nextFloat();
        obj = new Square(n1);
        System.out.printf("Perimeter = %.3f", obj.perimeter());
        System.out.printf("\narea = %.3f", obj.area());

        sc.close();
    }
}
