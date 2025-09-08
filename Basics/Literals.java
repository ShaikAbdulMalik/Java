package Basics;
public class Literals {
    public static void main(String[] args) {
        // literals
        int num1 = 0b101;
        int num2 = 0x7E;
        int num3 = 10_00_000;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        
        // Here 0b101 is a binary literal where 0b is a prefix that tells the compiler that it is a binary number and 101 is a binary number that represents 5 
        
        // 101 -> 1 x 2^2 = 4
        // 0 x 2^1 = 0
        // 1 x 2^0 = 1
        // then 4 + 0 + 1 = 5
        
        // Here 0x is the prefix for a hexadecimal number 

        // Here putting underscore after multiple zero helps the programmer understand and know how many zeros are present in the number but the underscore is printed on to the screen 
    }
}
