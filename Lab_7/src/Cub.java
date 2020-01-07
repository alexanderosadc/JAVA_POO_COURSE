public class Cub implements GeometricBody
{
    float side;

    Cub(float side)
    {
        this.side = side;
    };

    public double getSurface()
    {
        return Math.pow(side, 2);
    };

    public double getVolume() {
        return Math.pow(side, 3);
    }
}
