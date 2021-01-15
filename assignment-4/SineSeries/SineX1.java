/* 
    To find sine(x) for given x
    file name   :   SineX1.java
    date        :   14/09/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SineX1
{
    // to find the factorial of divisor terms
    static int fact(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    // to calculate sin(x)
    static float calculate(int n, float degree)
    {
        int sign = 1, j = 1, temp;
        float sum = 0;
        float radian = degree * (float) (Math.PI / 180);

        for (int i = 0; i < n; ++i)
        {
            temp = j;

            sum += ((Math.pow(radian, j)) / fact(temp)) * sign;
            sign *= -1;
            j += 2;
        }
        
        return sum;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter term = ");
        int num = Integer.parseInt(buf.readLine());

        System.out.print("Enter degree = ");
        float degree = Float.parseFloat(buf.readLine());

        // to calculate sin(x)
        System.out.printf("sin(%.3f) = %.5f", degree, calculate(num, degree));
    }
}