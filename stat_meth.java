
class mobile 
{
    String brand;
    int price;
    static String name;
    
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void display()
    {
        System.out.println("in static method");
        
        // System.out.println(brand + " : " + price + " : " + name);
        
        //here what happens is when i try to bring brand and price inside the static method i get an error because those values represent different values and they are not static and are not declared as static 
    }
}
public class stat_meth {
    public static void main(String[] args) {
        
        mobile obj1 =   new mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        mobile.name = "SmartPhone";
        
        mobile obj2 =   new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        mobile.name = "SmartPhone";
        
        mobile obj3 =   new mobile();
        obj3.brand = "Nokia";
        obj3.price = 1500;
        mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();
        obj3.show();

        mobile.display();
    }
}
