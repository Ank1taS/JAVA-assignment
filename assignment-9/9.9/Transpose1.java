/*
    programe name   :   to find transpose of a matrix
    file name       :   Transpose1.java
    date
*/

import java.util.Scanner;

class Transpose1 
{
    static void display(int[][] arr, int row, int col)
    {
        for(int i = 0 ; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                System.out.printf("%5d",arr[i][j]);
            }

            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();
        // matrix declaration and instantiation
        int[][] matrix = new int[row][col];

        // element inputs
        System.out.println("\tFor matrix");

        for(int i = 0; i < row; ++i)
        {
            for(int j = 0; j < col; ++j)
            {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]  -  ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // matrix declaration and instantiation
        int[][] tempMatrix = new int[col][row];

        for (int i = 0; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                tempMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("original matrix ");
        display(matrix, row, col);
        System.out.println("Transpose matrix ");
        display(tempMatrix, col, row);

        sc.close();
    }
}
