public class Paralelepiped implements GeometricBody
{
    float side;
    float h;

    Paralelepiped(float side, float h)
    {
        this.side = side;
        this.h = h;
    };

    public double getSurface()
    {
        return side * h;
    };

    public double getVolume() {

        return 4/3 * Math.PI * Math.pow(side * h, 3);
    }
}
