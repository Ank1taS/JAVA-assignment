/*
    programe name   :   to find sum of rows and column in matrix
    file name       :   Sum1.java
    date
*/

import java.util.Scanner;

class Sum1
{
    static void sumRow(int[][] matrix, int row, int col)
    {
        int sum ;

        for (int i = 0; i < row; ++i)
        {
            sum = 0;

            for (int j = 0; j < col; ++j)
            {
                sum += matrix[i][j]; 
            }

            System.out.println((i + 1) + " - " + sum);
        }
    }

    static void sumColumn(int[][] matrix, int row, int col)
    {
        int sum ;

        for (int i = 0; i < row; ++i)
        {
            sum = 0;

            for (int j = 0; j < col; ++j)
            {
                sum += matrix[j][i]; 
            }
            System.out.println((i + 1) + " - " + sum);
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

        System.out.println("original matrix ");

        for(int i = 0 ; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }

        // row sum
        System.out.println("sum of row = ");
        sumRow(matrix, row, col);

        // column sum
        System.out.println("sum of column = ");
        sumColumn(matrix, col, row);
        sc.close();
    }
}
