package Oops;
class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2; //here we gget 30 as the answer
    }
}
class Advcalc extends Calc
{
    //Now if i comments this whole statment out then java will go to the parent class and ask if it has the add function (ex: if n1 = 2 and n2 = 3 then according to Calc we'll get 5 as the answer)
    
    public int add(int n1, int n2)  //therefore this add method overrides the add method in Calc class
    {
        return n1+n2+1; //here we get 31 as the anwer 
    }
}
public class MethOride {
    public static void main(String[] args) {
        Advcalc a = new Advcalc();
        int r1 = a.add(10, 20);
        System.out.println(r1);
    }
}
