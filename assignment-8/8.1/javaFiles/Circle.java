// circle file cointaing implementation for Circle Class

package shape;
import shape.*;

public class Circle implements Shape
{
    float radious;

    public Circle(float radious)
    {
        this.radious = radious;
    }

    public float perimeter()
    {
        return (2 * (float)Math.PI * radious) ;
    }

    public float area()
    {
        return ((float)Math.PI * (radious * radious));
    }
}
