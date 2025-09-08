package Oops;
class Calc
{
    public int add (int n1, int n2)
    {
        return n1 + n2;
    }
    public int add (int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add (double n1, double n2)
    {
        return n1 + n2;
    }
    
    
}
public class Methodover {
    public static void main(String[] args) {
        Calc obj = new Calc();
        
        int r1 = obj.add(10, 30);
        double r2 = obj.add(10.4, 2.33);
        int r3 = obj.add(2, 3, 4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }    
}

