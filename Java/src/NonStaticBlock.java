public class NonStaticBlock {
       int i1=2,i2=3;

static{
       int i=1;
    System.out.println("Static int variable = "+i);
      }
      {
          int i3=i1*i2;
        System.out.println("Non Static int variable = "+i3);
      }
public static void main(String[]args)
{
    System.out.println("Main Started");
    NonStaticBlock Ref = new NonStaticBlock();
    System.out.println("Main Ended");

}
static{
    char c='Z';
    System.out.println("Static char variable = "+c);
      }
}
