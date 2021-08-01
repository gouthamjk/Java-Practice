class super2
{
    int demo(int arg)
    {
        System.out.println("super class method");
        return arg*arg;    
    }
    int demo(int arg1, int arg2)
    {
        System.out.println("super class method");
        return arg1+arg2;
    }
}
class sub2 extends super2
{
    int demo(int arg)
    {
        System.out.println("super class = "+super.demo(4));
        System.out.println("sub class method");
    return arg*arg;
    }
    int demo(int arg1, int arg2)
    {
        System.out.println("super class = "+super.demo(20,20));
        System.out.println("sub class method");
        return arg1*arg2;
    }
}
public class Polymorphism1
{
    public static void main(String[] args) {
        sub2 ref = new sub2();
        System.out.println("demo (int) = "+ref.demo(8));
        System.out.println("demo (int) = "+ref.demo(10,20));
    }
}