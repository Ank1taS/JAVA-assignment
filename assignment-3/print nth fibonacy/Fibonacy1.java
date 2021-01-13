// programe to print nth fibonacy number while taking input as command line argument
// file name    : Fibonacy1.java
// date         : 10/09/2020

class Fibonacy1 
{
    static int printFibonacy(int num)
    {
        int x = 1, y = 0;
        for(int i = 1; i <= num ; ++i)
        {
            if(i == num)
            {
                return y;
            }
            y = x - y;
            x += y;
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        if((args.length) != 1)
        {
            System.out.println("Invalid number of argument(s)..\n programe ends...");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);

        System.out.println(n + "th fibanacy number in fibonacy series is = " + printFibonacy(n));
    }    
}
