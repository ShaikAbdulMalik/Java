abstract class car
{
    public abstract void drive();
    public abstract void flying();
    public void music()
    {
        System.out.println("Playing msuic..");
    }
}
abstract class Bmw extends car
{
    public void drive()
    {
        System.out.println("Car is driving");
    }
}
class UpdatedBmw extends Bmw
{
    public void flying()
    {
        System.out.println("Flying....");
    }
}
public class abs {
    public static void main(String[] args) {
        car a = new UpdatedBmw();
        a.drive();
        a.flying();
        a.music();
    }
}
