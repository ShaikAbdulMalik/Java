class A
{
    void show()
    {
        System.out.println("In A show");
    }
}
public class AnonInner {
    public static void main(String[] args) {
        A obj = new A()
        {
            @Override
            void show()
            {
                System.out.println("In anonymous show");
            }
        };
        obj.show();
    }    
}
