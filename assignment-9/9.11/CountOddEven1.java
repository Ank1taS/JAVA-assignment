/*
    programe name   :   to find frequency of odd and even integers in matrix
    file name       :   CountOddEven1.java
    date
*/

import java.util.Scanner;

class CountOddEven1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();

        // matrix declaration and instantiation
        int[][] matrix = new int[row][col];
        int oddCount = 0;
        int evenCount = 0;

        // element inputs
        System.out.println("\tFor matrix");
        for(int i = 0; i < row; ++i)
        {
            for(int j = 0; j < col; ++j)
            {
                System.out.print("[" + (i + 1) + "]" + "[" + (j + 1) + "]  -  ");
                matrix[i][j] = sc.nextInt();

                if (matrix[i][j] % 2 == 0){
                    ++evenCount;
                }
                else{
                    ++oddCount;
                }
            }
        }

        System.out.println("\t matrix \n");

        for(int i = 0 ; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                System.out.printf("%5d", matrix[i][j]);
            }

            System.out.print("\n\n");
        }

        System.out.print("total number of odd digits = " + oddCount + "\ntotal number of even digits = " + evenCount);
        sc.close();
    }
}
