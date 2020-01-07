public class main {
    public static void main(String[] args) {
        GeometricBody[] geometricBodies = new GeometricBody[3];
        geometricBodies[0] = new Cub(12);
        geometricBodies[1] = new Sphere(3);
        geometricBodies[2] = new Paralelepiped(2, 15);

        GeometricBodysController geometricBodysController = new GeometricBodysController();

        geometricBodysController.maxSurface(geometricBodies);
        geometricBodysController.maxVolume(geometricBodies);
    }
}
