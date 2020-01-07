public class GeometricBodysController {

    GeometricBody maxVolume(GeometricBody[] geometricBodies)
    {
        double maxVolumeFound = 0;
        int indexOfMaxVolumeFigure = 0;

        for(int i = 0; i < geometricBodies.length; i++)
        {
            if(geometricBodies[i].getVolume() > maxVolumeFound)
            {
                maxVolumeFound = geometricBodies[i].getVolume();
                indexOfMaxVolumeFigure = i;
            }
        }

        return geometricBodies[indexOfMaxVolumeFigure];
    }

    GeometricBody maxSurface(GeometricBody[] geometricBodies)
    {
        double maxSurfaceFound = 0;
        int indexOfMaxSurfaceFigure = 0;

        for(int i = 0; i < geometricBodies.length; i++)
        {
            if(geometricBodies[i].getSurface() > maxSurfaceFound)
            {
                maxSurfaceFound = geometricBodies[i].getVolume();
                indexOfMaxSurfaceFigure = i;
            }
        }

        return geometricBodies[indexOfMaxSurfaceFigure];
    }
}
