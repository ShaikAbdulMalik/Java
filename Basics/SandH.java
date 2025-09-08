package Basics;
class Calculator 
{
    int num = 10;

    public int add (int n1, int n2)
    {
        return n1 + n2;
    }
}

public class SandH {
  public static void main(String[] args) {
    
    int data = 10;

    Calculator obj = new Calculator();
    Calculator obj1 = new Calculator();

    int r1 = obj.add(2, 3);
    // System.out.println(r1);

    obj.num = 12; // if i do this on;y the obj value is changed but not the other one since only obj is impacted thats why
    System.out.println(obj.num);
    System.out.println(obj1.num);

    
  }  
}
