/* 
    programe name   :   to add 2 matrix
    file name       :   MatrixAddition1.java
    date          
*/

import java.util.Scanner;

class MatrixAddition1
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

        if (row1 != row2 || col1 != col2)
        {
            System.out.println("both the matrix are not same order ");
            sc.close();
            return;
        }

        // array declaration
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] matrix3 = new int[row1][col1];

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
        for(int i = 0; i < row1; ++i)
        {
            for(int j = 0; j < col1; ++j)
            {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]  -  ");
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        // addition
        for(int i = 0; i < row1; ++i)
        {
            for(int j = 0; j < col1; ++j)
            {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // displays
        display(matrix1, row1, col1);
        System.out.println();
        display(matrix2, row1, col1);
        System.out.println();
        display(matrix3, row1, col1);

        sc.close();
    }
}
