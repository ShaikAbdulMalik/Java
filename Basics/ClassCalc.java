package Basics;
import java.util.Scanner;

class Calculator
{
    int a;
    
    public int add( int n1 ,int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1,int n2)
    {
        return n1 - n2;
    }
}
public class ClassCalc {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Calculator calc = new Calculator();
        
        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();
        
        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();

        scan.nextLine();
        
        System.out.println("Enter the Operation (Add/Sub) : ");
        String operation = scan.nextLine();
        
        if (operation.equals("add") ) {
            
            int result = calc.add(num1,num2);
            System.out.println("The result is : " + result);
        }
        else if ( operation.equals("sub"))
        {
            int result = calc.sub(num1, num2);
            System.out.println("The result is : " + result);
        }
        else
        {
            System.out.println("The operator is invalid");
        }

        
        scan.close();
    }
}
