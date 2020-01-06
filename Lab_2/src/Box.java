public class Box {
    private int height;
    private int width;
    private int depth;

    private float volume;
    private float area;
    Box()
    {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    Box(int value)
    {
        this.height = value;
        this.width = value;
        this.depth = value;
    }

    Box(int height, int width, int depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;

        volume = height * width * depth;
        area = height * width;
    }
}
