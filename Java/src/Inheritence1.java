class super1 extends Object
{
char c='z';
void disp1()
{
  System.out.println("Super class method");  
}
}
    class sub1 extends super1{
        double d=67.53;
    void disp2()
{
    System.out.println("Sub class method");
    }    
}
public class Inheritence1{
    public static void main(String[] args) {
        sub1 ref = new sub1();
        System.out.println("Super class variable = "+ref.c);
        ref.disp1();
        System.out.println("Sub class variable = "+ref.d);
        ref.disp2();
    }
}