public class BlocksWithoutMain {
    static int i;
    int i1,i2;
    static char c;

static{
   int i=1;
    System.out.println("Static int variable = "+i);
      }
      {
        int i1=2;
        System.out.println("Non Static int variable = "+i1);
      } 
      static{
        char c='A';
        System.out.println("Static char variable = "+c);
          }
    }
