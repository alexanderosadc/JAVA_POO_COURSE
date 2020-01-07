public class A {
    protected String a;
    protected X xvar = new X("xxx");

    A(String str, X xvar)
    {
      a = str;
      System.out.println(str);
      //this.xvar = xvar;
    }
}
