/*
    programe name   :   to find upper triangular matrix
    file name       :   TriangularMatix1.java
    date
*/

import java.util.Scanner;

class TriangularMatrix1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();

        if (row != col)
        {
            System.out.println("row and column are not same.");
            sc.close();
            return;
        }

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

        System.out.println("original matrix ");

        for(int i = 0 ; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("upper triangular matrix ");

        for (int i = 0; i < row; ++i)
        {
            for (int j = 0 ; j < row - i; ++j)
            {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println("\n");
        }        
        sc.close();
    }
}
