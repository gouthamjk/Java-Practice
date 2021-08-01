public class Blocks {
    static int i;
    int i1,i2;
    static char c;

static{

    System.out.println("Static int variable = "+i);
      }
      {
        System.out.println("Non Static int variable = "+i1);
      }
public static void main(String[]args)
{
    System.out.println("Main Started");
    Blocks A = new Blocks();
    System.out.println("Main Ended");

}
static{
    
    System.out.println("Static char variable = "+c);
      }
}
