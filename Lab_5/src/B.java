public class B extends A {
    protected String b;

    B()
    {
        super("blahblahblah", new X("FAF"));
        b = "B";
        System.out.println(b);
    }
}
