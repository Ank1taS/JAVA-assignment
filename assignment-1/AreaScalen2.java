public class HelloWorld{

     public static void main(String []args){
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = Float.parseFloat(args[2]);

        float s = (a + b + c) / 2f;

        System.out.printf("Area of the triangle is : %.5f ",Math.sqrt( s * (s - a) * (s - b) * (s - c)));
     }
}