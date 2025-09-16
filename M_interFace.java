interface Computer
{
    void code();
}
class Laptop implements Computer
{
    public void code ()
    {
        System.out.println("coding....");
    }
}
class Desktop implements Computer
{
     public void code ()
    {
        System.out.println("coding.... Faster");
    }
}
class Developer
{
    public void devApp(Computer L)
    {
        L.code();
        // System.out.println("Dev is coding..");
    }
}
public class M_interFace {
    public static void main(String[] args) {
        
        Computer L = new Laptop();

        Computer d = new Desktop();

        Developer malik = new Developer();
        malik.devApp(d);
        malik.devApp(L);
    }
}
