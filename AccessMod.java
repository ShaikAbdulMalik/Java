import Mypackage.A;
import Mypackage2.B;

public class AccessMod {
    public static void main(String[] args) {
            
            A obj1 = new A();
            B obj2 = new B();

            System.out.println("To check if the private class from A can be accesssed in the main class");
            obj1.testprivate();

            System.out.println("Access from the main class (same package = no)");
            
            // System.out.println(obj1.priv);
            // System.out.println(obj1.prov); //All of these are not allowed 
            // System.out.println(obj1.dv);
            
            System.out.println(obj1.pubv); //public are alloweded
            obj1.pubm();    

            System.out.println("Access from the child class B");
            obj2.AccessfromChild();
    }
}
