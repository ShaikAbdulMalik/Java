class Calc
{
    int x = 10;
    int y = 11;
    void display()
    {
        System.out.println("This is a calculator");
    }
    class add
    {
        void show()
        {
            System.out.println("Addition : " + (x+y));
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        Calc s1 = new Calc();
        Calc.add s2 = s1.new add();
        s1.display();
        s2.show();

    }
}
