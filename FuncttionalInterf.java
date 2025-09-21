@FunctionalInterface
interface A
{
    void show();
}
public class FuncttionalInterf {
    public static void main(String[] args) {
        A obj = new A() { //This is a inner anonymous class
            public void show()
            {
                System.out.println("Hello!!");
            }
        };
        obj.show();
    }
}
