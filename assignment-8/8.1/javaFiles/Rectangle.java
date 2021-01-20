// Rectangle file cointaing implementation for Rectangle Class

package shape;
import shape.*;

public class Rectangle implements Shape
{
    float length;
    float breadth;

    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public float perimeter()
    {
        return (2 * (length + breadth)) ;
    }

    public float area()
    {
        return (length * breadth);
    }
}
