public class BlockValuePass {
    int i1=2,i2=3,i4;

static{
    int i=1;
 System.out.println("Static int variable = "+i);
   }
   {
       int i3=i1*i2*i4;
     System.out.println("Non Static int variable = "+i3);
   }
public static void main(String[]args)
{
 System.out.println("Main Started");
 {
     int i4;
 }
 BlockValuePass Ref = new BlockValuePass(i4=2);
 System.out.println("Main Ended");

}
static{
 char c='Z';
 System.out.println("Static char variable = "+c);
   }
}
