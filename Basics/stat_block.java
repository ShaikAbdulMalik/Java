package Basics;
class Mobile
{
    String brand;
    int price;
    static String name;

    static
    {
        name = "phone";
        System.out.println("in static block");
        // this is a static block it calls the method once before any object hence its called as a static block its written in the class
        //but theirs a catch to it if you dont load the class into the memory it wont call the static block or the static block wont be loaded 
        //but if you still want to load the static block you would need to use a new keyword thats "Class.forName("Mobile")" this here will load your static method and perform the function in the static method   
    }
    public Mobile()
    {
        brand = "";
        price = 2000;
        System.out.println("in constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class stat_block {
    public static void main(String[] args) throws ClassNotFoundException
    {
        
        Class.forName("Mobile");
        //This is a Class that used in the main method to call the static method 

        // Mobile obj = new Mobile();
        // obj.brand = "alpple";
        // obj.price = 2000;
        // Mobile.name = "SmartPhone";

        // Mobile obj1 = new Mobile();
    }
}
