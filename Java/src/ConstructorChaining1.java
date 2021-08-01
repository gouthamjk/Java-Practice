class base1
{
    base1()
    {
        System.out.println("Base class Constructor");
    }
}
class derived1 extends base1{
    derived1(){
super();
System.out.println("derived class constructor");
    }
}
public class ConstructorChaining1{
    public static void main(String[] args) {
        derived1 ref = new derived1();
    }
}