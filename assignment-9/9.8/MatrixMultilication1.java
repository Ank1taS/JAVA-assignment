/* 
    programe name   :   to multiply 2 matrix
    file name       :   MatrixMultiplication1.java
    date          
*/

import java.util.Scanner;

class MatrixMultilication1 
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
        System.out.println();
    }

    static int[][] multiply(int[][] matrix1, int[][] matrix2, int[][] matrix3, int row1, int col1, int col2)
    {
        for (int i = 0; i < row1; ++i)
        {
            for (int j = 0; j < col2; ++j)
            {
                for (int k = 0; k < col1; ++k) 
                {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrix3;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tFor matrix1");
        System.out.print("row = ");
        int row1 = sc.nextInt();
        System.out.print("column = ");
        int col1 = sc.nextInt();

        System.out.println("\tFor matrix2");
        System.out.print("row = ");
        int row2 = sc.nextInt();
        System.out.print("column = ");
        int col2 = sc.nextInt();

        if (col1 != row2 )
        {
            System.out.println(" matrix1 column size is not equal as matrix2 row size.");
            sc.close();
            return;
        }

        // array declaration
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] matrix3 = new int[row1][col2];

        // element inputs for matrix1
        System.out.println("\tFor matrix1");

        for(int i = 0; i < row1; ++i)
        {
            for(int j = 0; j < col1; ++j)
            {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]  -  ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // element inputs for matrix2
        System.out.println("\tFor matrix2");

        for(int i = 0; i < row2; ++i)
        {
            for(int j = 0; j < col2; ++j)
            {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]  -  ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        // multiplication
        matrix3 = multiply(matrix1, matrix2, matrix3, row1, col1, col2);
 
        // displays
        display(matrix1, row1, col1);
        display(matrix2, row2, col2);
        display(matrix3, row1, col2);

        sc.close();
    }
}
