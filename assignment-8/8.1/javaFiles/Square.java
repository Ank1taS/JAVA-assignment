// square file containg implementation for square Class

package shape;
import shape.*;

public class Square implements Shape
{
    float side;

    public Square(float side)
    {
        this.side = side;
    }

    public float perimeter()
    {
        return (4 * side) ;
    }

    public float area()
    {
        return (side * side);
    }
}
