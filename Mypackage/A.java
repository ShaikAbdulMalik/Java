package Mypackage;

public class A {
    
    private int priv = 10; //this is private 
    int dv = 20; //this is default
    protected int prov = 30; //this is protected
    public int pubv = 40; //this is public 

    private void prim()
    {
        System.out.println("Private method");
    }

    void dm()
    {
        System.out.println("default method");
    }

    protected void prom()
    {
        System.out.println("Protected method");
    }

    public void pubm()
    {
        System.out.println("public method");
    }

//in order to test whether the access modifier runs only in the same class

    public void testprivate()
    {
        System.out.println("Private method : " + priv);
        prim();
    }
}

