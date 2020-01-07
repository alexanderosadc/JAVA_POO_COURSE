public class Sphere implements GeometricBody
{
    float radius;

    Sphere(float radius)
    {
        this.radius = radius;
    };

    public double getSurface()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    };

    public double getVolume() {

        return 4/3 * Math.PI * Math.pow(radius, 3);
    }
}
