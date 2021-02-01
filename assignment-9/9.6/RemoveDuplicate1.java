/* 
    programe name   :   to remove duplicate elemnts in an array
    file name       :   RemoveDuplicate1.java
    date            :
*/

import java.util.Scanner;

class RemoveDuplicate1 
{
    static void display(int[] arr, int size)
    {
        int count = 0;

        for(int i : arr)
        {   
            if(count == size)
            {
                break;
            }

            count += 1;
            System.out.print(i + "  ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size = ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter element - ");
        
        for (int i = 0; i < size; ++i)
        {
            arr[i] = sc.nextInt();
        }

        // display
        System.out.println("Elements of the array with duplicacy = ");
        display(arr, size);

        int[] temp = new int[size];
        int tempSize = 1;
        temp[0] = arr[0];

        for (int i = 1; i < size; ++i)
        {        
            boolean found = false;

            for (int j = 0; j < tempSize; ++j)
            {
                if (arr[i] == temp[j])
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {           
                temp[tempSize] = arr[i];
                ++tempSize;
            }
        }

        arr = temp.clone();
        System.out.println("\nElements of the array without duplicacy = ");
        display(arr, tempSize);

        sc.close();
    }
}
