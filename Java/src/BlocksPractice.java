public class BlocksPractice {
        
        int i1,i2;
        static char c;
    
    static{
       int i=2;
        System.out.println("Static int variable = "+i);
          }
          {
            int i2=3;
            System.out.println("Non Static int variable = "+i2);
          }
    public static void main(String[]args)
    {
        System.out.println("Main Started");
        BlocksPractice A = new BlocksPractice();
        System.out.println("Main Ended");
    
    }
    static{
        
        System.out.println("Static char variable = "+c);
          }
    }
    
