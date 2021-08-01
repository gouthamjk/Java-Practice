public class NonStaticMethod
{
    int Months(int arg1)
    {
        int A1=arg1+2;
    return A1;
    }
public static void main(String[]args)
    {
    int A2=new NonStaticMethod().Months(3);
    System.out.println("Countdown to get out of here in months = "+A2);
    }
}