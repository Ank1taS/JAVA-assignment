/*
    programe name   :   to rotate right array elements
    file name       :   RotateRight1.java
    date            :   12/10/2020
*/

import java.util.Scanner;

class RotateRight1
{
    void display(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }
    }

    void rotate(int[] arr)
    {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0 ; --i)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RotateRight1 obj = new RotateRight1();

        System.out.print("Enter total element numbers =  ");
        int size = sc.nextInt();

        // array declaration and instantiation
        int[] arrInt = new int[size];

        // initialisation
        System.out.println("Enter elements : ");
        for(int i = 0; i < size; ++i)
        {
            System.out.print((i + 1) + " : ");
            arrInt[i] = sc.nextInt();
        }

        // display
        System.out.println("Array elements before right rotation : ");
        obj.display(arrInt);

        obj.rotate(arrInt);

        System.out.println("\nArray elements after right rotation : ");
        obj.display(arrInt);

        sc.close();
    }
}