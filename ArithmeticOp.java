public class ArithmeticOp 
{
    
    public static void main(String[] args) 
    {
        int num1 = 7;
        int num2 = 5;

        int Add = num1 + num2;
        int Sub = num1 - num2;
        int Mul = num1 * num2;
        int Div = num1 / num2;
        int Mod = num1 % num2;
       
        System.out.println(Add);
        System.out.println(Sub);
        System.out.println(Mul);
        System.out.println(Div);
        System.out.println(Mod);

        num1 += 2;
        num1 ++; // This is post increment
        num1 --; // This is post decrement
        // ++num1; // This is pre increment
        // --num1; // This is pre-decrement
        System.out.println(num1);
    
        // You may wonder why both we use pre and post when they return the same value.

        int num = 7;
        // int result = num++; // Here num++ fetches the value then increments the value

        int result = ++num;
         // Here it increments the value and then fetches the result
        
        System.out.println(result);
    }
}
