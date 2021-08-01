interface a1
{
void sample(int arg);
}
interface a2
{
void sample(String arg);
}
interface a3
{
void sample(boolean arg);
}
class sub implements a1,a2,a3
{
public void sample(int arg)
{
    System.out.println("Int arg = "+arg);
}
public void sample(String arg)
{
    System.out.println("String arg = "+arg);
}
public void sample(boolean arg)
{
    System.out.println("Boolean arg = "+arg);
}
}
public class Interface1 {
    public static void main(String[] args) 
   {
       sub ref = new sub();
       ref.sample(10);
       ref.sample("JAVA");
       ref.sample(true);
   } 
}