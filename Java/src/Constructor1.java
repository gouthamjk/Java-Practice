class Cons1 {
    int i=2; int j=3;
    Cons1()  //Default/zero parameterized constructor//
    {
        int k= i*j;
     System.out.println("Value of the variable k = "+k);
    }
}
public class Constructor1 {
    public static void main (String[]args)
    {
        System.out.println("Main Started");
        Cons1 ref = new Cons1();
        System.out.println();
        System.out.println("Main Ended");
    }
}