class parent1
{
    int i;
    parent1(int arg)
    {
        i=arg;
        System.out.println("parent class constructor");
        System.out.println("Int arg = "+arg);
    }
}
class child extends parent1
{
    child()
    {
        super('a');
        System.out.println("default constructor of child class");
    }
    child(String arg)
    {
        this();
        System.out.println("String Arg Constructor");
        System.out.println("String Arg = "+arg);
    }
}
public class ConstructorChaining2
{
    public static void main(String[] args) 
    {
        child ref = new child("JAVA");
        parent1 ref1 = new parent1(20);
        System.out.println("Int arg = "+ref1.i);

    }
}