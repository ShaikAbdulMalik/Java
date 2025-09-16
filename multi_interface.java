interface A
{
    int age = 44;
    String area = "mumbai";

    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X //To extend two interfaces we use extends keyword instead of the usual implements keyword 
{

}
class B implements A,X
{
    public void show()
    {
        System.out.println("in Interface A show");
    }
    public void config()
    {
        System.out.println("In config");
    }
    public void run()
    {
        System.out.println("running...");
    }
}
public class multi_interface {
    public static void main(String[] args) {
        B b = new B();
        b.config();
        b.run();
        b.show();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
