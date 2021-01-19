/*
    programe name   :   To create a interface class "Marks" with abstract method "grtPercentage" . 
                        It is inherited by class A having 3 subject (each of 100) and B having 4 subject (each of 100)
                        To create an object for each of 2 classes and print the percentage of marks for both the student.  
    file name       :   PercentageCalculation1.java
    date            :
*/

import java.util.Scanner;

interface Mark
{
    abstract float getPercentage();
}

class A implements Mark
{
    float sub1, sub2, sub3;

    A(float sub1, float sub2, float sub3)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public float getPercentage() 
    {
        return ((sub1 + sub2 + sub3) / 3);
    }
}

class B implements Mark
{
    float sub1, sub2, sub3, sub4;

    B(float sub1, float sub2, float sub3, float sub4)
    {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public float getPercentage() 
    {
        return ((sub1 + sub2 + sub3 + sub4) / 4);
    }
}

class PercentageCalculation1
{
    public static void main(String[] args)
    {
        float s1, s2, s3, s4;

        Scanner sc = new Scanner(System.in);

        Mark obj1;
        Mark obj2;
        
        System.out.println("For class A ");
        System.out.print("sub1 = ");
        s1 = Float.parseFloat(sc.nextLine());
        System.out.print("sub2 = ");
        s2 = Float.parseFloat(sc.nextLine());
        System.out.print("sub3 = ");
        s3 = Float.parseFloat(sc.nextLine());

        obj1 = new A(s1, s2, s3);
        System.out.printf("Percentage secured = %.2f", obj1.getPercentage());

        System.out.println("For class B ");
        System.out.print("sub1 = ");
        s1 = Float.parseFloat(sc.nextLine());
        System.out.print("sub2 = ");
        s2 = Float.parseFloat(sc.nextLine());
        System.out.print("sub3 = ");
        s3 = Float.parseFloat(sc.nextLine());
        System.out.print("sub4 = ");
        s4 = Float.parseFloat(sc.nextLine());

        obj2 = new B(s1, s2, s3,s4);
        System.out.printf("Percentage secured = %.2f", obj2.getPercentage());

        sc.close();
    }
}
