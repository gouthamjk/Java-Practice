public class Constructor3 {
    int k=6;
        Constructor3(int j)
        {
            int i=2;
            k=i+j;
            System.out.println("The value of variable k = "+k);
        }
        Constructor3(int j, double c)
        {
            double l = j*c;
        System.out.println("The value of variable l = "+l);
        }
        Constructor3(Constructor3 C)
        {
            int m=C.k;
            System.out.println("The value of variable m = "+m);
        }
        Constructor3()
        {
            int i=2;
            k=i+1;
            System.out.println("The value of variable k = "+k);
        }
    public static void main(String[]args)
    {
        System.out.println("Main Started");
        Constructor3 ref = new Constructor3(3);
        Constructor3 ref1 = new Constructor3(2,4);
        System.out.println("Value of k variable from 1st Constructor = "+ref.k);
        Constructor3 ref2 = new Constructor3(ref);
        Constructor3 ref3 = new Constructor3();
        Constructor3 ref4 = new Constructor3(3);
        System.out.println("Main Ended");
    }
    }
    

