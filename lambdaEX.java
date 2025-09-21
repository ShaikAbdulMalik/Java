@FunctionalInterface
interface A
{
    // void show(); //this is normal method
    // void show(); // This does not return any value
    int show(int a, int b); //Now this is a parameterized method //this is a return type 
}
public class lambdaEX {
    public static void main(String[] args) {
        // A obj = (a, b) -> a + b; 
        // System.out.println("Hello from Lambda " + obj.show(10,20));
        // obj.show(10,20); //This is for single statement

        A obj = (a,b) -> {
            System.out.println("Muliplying the numbers " + a + " and " + b);
            return a*b;
        };
        System.out.println("Answer : " + obj.show(9,8));
    }
}
