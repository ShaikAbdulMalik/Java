package Oops;
public class Inheri_oops {
    public static void main(String[] args) {
        
        Inheri_VadvCalc obj = new Inheri_VadvCalc();
        
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(30, 20);
        int r3 = obj.multi(3, 2);
        int r4 = obj.div(30, 5);
        double r5 = obj.power(2,5);

        System.out.println("Add and sub : " + r1 + " and " + r2);  
        System.out.println("Multi and div : " + r3 + " and " + r4); 
        System.out.println("powers are : " + r5); 
    }
}
