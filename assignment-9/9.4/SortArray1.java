/*  programe name   :   to sort an int array in default order
    file name       :   SortArray1.java
    data
*/

import java.util.Scanner;
import java.util.Arrays;

class SortArray1 
{
    static void display(int arr[])
    {
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total elements - ");
        int size = sc.nextInt();

        // array declaration and instantiation
        int[] arr = new int[size];
        
        // initialisation
        System.out.println("Enter elements ");
        for (int i = 0; i < size; ++i)
        {
            System.out.print((i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elemets before sorting - ");
        display(arr);
        // sort array
        Arrays.sort(arr);
        System.out.println("\nElemets after sorting - ");
        display(arr);

        sc.close();       
    }
}
