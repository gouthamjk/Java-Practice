class Compo1 {
    int i=50;
    void Demo1()
    {
        System.out.println("Class Compo1 method");
    }
}
class Compo2 {
    Compo1 ref1 = new Compo1();
    String S = "JAVA";
    void Demo2()
    {
        System.out.println("Class Compo2 method");
    }
}
public class Composition1{
    public static void main(String[]args)
    {
      Compo2 ref2 = new Compo2();  
      System.out.println("Class Compo2 variable = "+ref2.S);
      ref2.Demo2();
      System.out.println("Class Compo2 variable = "+ref2.ref1.i);
      ref2.ref1.Demo1();
   }
}

