public class Constructor2 {
    Constructor2(int j)
    {
        int i=2;
        int k=i+j;
        System.out.println("The value of variable k ="+k);
    }
public static void main(String[]args)
{
    System.out.println("Main Started");
    Constructor2 ref = new Constructor2(3);
    System.out.println("Main Ended");
}

}
