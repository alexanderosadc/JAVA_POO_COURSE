import java.util.ArrayList;

public class Queue {

    private int maxSize;
    private ArrayList<Box> boxes;
    private boolean isParameters;

    Queue() {
        boxes = new ArrayList<Box>();
        isParameters = false;
    }

    Queue(int maxSize) {
        boxes = new ArrayList<>();
        isParameters = true;
        this.maxSize = maxSize;
    }

    public void push(Box value) {
        if(isParameters)
        {
            if(boxes.size() < maxSize)
            {
                boxes.add(value);
            }
            else
            {
                System.out.println("Out of Space");
            }
        }
        else
        {
            boxes.add(value);
        }
    }

    public Box pop() {
        Box temporaryBox;
        if(boxes != null)
        {
            temporaryBox = boxes.get(0);
            boxes.remove(0);
            return temporaryBox;
        }
        return null;
    }

    public void checkIfFull()
    {
        if(isParameters)
        {
            System.out.println("Current size:"+ boxes.size() + "\nMaxSize" + maxSize);
        }
        else
        {
            System.out.println("It is never full");
        }
    }

}
//Print
