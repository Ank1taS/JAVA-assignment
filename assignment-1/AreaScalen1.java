// to find the are of a scalen triangle whose are is given as command line argumwnt


class AreaScalen1
{
    public static void main(String arr[])
    {
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        int s = (a + b + c) / 2;

        System.out.println("Area of the triangle is : " + Math.sqrt( s * (s - a) * (s - b) * (s - c)));

    }
}