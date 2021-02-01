/*
    programe name   :   to rotate left array elements
    file name       :   RotateLeft1.java
    date            :   12/10/2020
*/

import java.util.Scanner;

class RotateLeft1
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
        int temp = arr[0];

        for (int i = 1; i < arr.length; ++i)
        {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RotateLeft1 obj = new RotateLeft1();

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
        System.out.println("Array elements before left rotation : ");
        obj.display(arrInt);

        obj.rotate(arrInt);

        System.out.println("\nArray elements after left rotation : ");
        obj.display(arrInt);

        sc.close();
    }
}
