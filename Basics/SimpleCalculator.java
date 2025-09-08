package Basics;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operator = (+ / - / * / '/')");
        char operator = sc.next().charAt(0);

        double result;

        if(operator == '+')
        {
            result = num1 + num2;
        }
        else if(operator == '-')
        {
            result = num1 - num2;
        }
        else if(operator == '*')
        {
            result = num1 * num2;
        }
        else if(operator == '/') 
        {
            if (num2 != 0) 
            {
                result = num1 / num2;    
            }
            else
            {
                System.out.println("Division by zero is not possible!!");
                return;
            }
        }
        else
        {
            System.out.println("Invalid Operator!!!");
            return;
        }
        System.out.println("Result : " + result);
        sc.close();
    }
}
