class A 
{
    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int M)
    {
        super();
        System.out.println("in parametrized A");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int N)
    {
        this();
        System.out.println("in parameterized B");
    }
}
public class This_Super {
    public static void main(String[] args) {
        B obj = new B(2);
    }    
}
