
public class main {
    public static void main(String[] args) {
        Box box1 = new Box(), box2 = new Box(5), box3 = new Box(1, 6, 4);
        Queue queue1 = new Queue(), queue2 = new Queue(2);

        queue2.push(box1);
        queue2.push(box2);
        queue2.push(box3);

        queue2.pop();

        queue2.checkIfFull();

        queue1.push(box1);
        queue1.push(box2);

        queue1.pop();

        queue1.checkIfFull();
    }
}
