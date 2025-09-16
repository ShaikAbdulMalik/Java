    
interface A
{
    int age = 18; //Variables in interface are final and  static
    String name = "Malik";

    void show();
    void display();
}
class view implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void display()
    {
        System.out.println("In display");
    }
}
public class interf {
    public static void main(String[] args) {
        
        A obj = new view();
        obj.display();
        obj.show();

        System.out.println(A.age);
        System.out.println(A.name);
    }
}
