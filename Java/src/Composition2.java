class Compo3 {
    int i=50;
    void Demo1()
    {
        System.out.println("Class Compo1 method");
    }
}
class Compo4 {
    static Compo1 ref1 = new Compo1();
    String S = "JAVA";
    void Demo2()
    {
        System.out.println("Class Compo2 method");
    }
}
public class Composition2{
    public static void main(String[]args)
    {
      Compo4 ref2 = new Compo4();  
      System.out.println("Class Compo2 variable = "+ref2.S);
      ref2.Demo2();
      System.out.println("Class Compo2 variable = "+Compo4.ref1.i);
      Compo4.ref1.Demo1();
   }
}

