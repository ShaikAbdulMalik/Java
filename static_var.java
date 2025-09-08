
class Car
{
    String lamborghini;
    String ferrari;
    static int horsepower;
    public void show()
    {
        System.out.println(ferrari + " : " + horsepower + " : " + lamborghini );
    }
}
public class static_var {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.lamborghini = "black";
        Car.horsepower = 1200; // The static variable should be accessed in a static way i.e by using its class name 
        
        Car car2 = new Car();
        car2.ferrari = "red";
        Car.horsepower = 1200;

        Car.horsepower =2200;

        car1.show();
        car2.show();
    }
}
