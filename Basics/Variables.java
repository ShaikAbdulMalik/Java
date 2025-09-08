package Basics;
public class Variables 
{
    public static void main (String[] args)
    {
        int num = 3;
        int num1 = 1;
        int num2 = 5;
        int result = num1 + num2;
        byte by = 127;
        short sh = 558;
        long l = 5854l;
        float f = 5.8f;
        double d = 5.8;
        
        char c = 'k';//always put single quotes without it, it will show errors
        
        boolean b = true;

        // int MyAge = 20;
        // int HerAge = MyAge;
        // System.out.println(HerAge);

        System.out.println(3 + 5);
        System.out.println(num);
        System.out.println(num1 + num2);
        System.out.println(result);
        // Datatypes : there are two types of datatypes that are primitive and non primitive 
        // primitive:- Integer , Float , Characters , Boolean
        // Integer -> int - 4bytes , long - 8bytes , short - 2bytes , byte - 1byte
        // -2^7 to 2^7 - 1
        // -128 to 128
        // float -> 4bytes
        // double -> 8bytes
        // char -> 2bytes
        // char supports unicode instead of ASCI value
        // Boolean -> its only represented by true and false (boolean b = true or false ;)
     }
}
