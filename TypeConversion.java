
public class TypeConversion {
    public static void main(String[] args) {
        // type conversion refers to the process of changing value  of one data type to another
         byte b = 127;
         int a = 256;
         a = b; // This is called as implicit value or implicit conversion
         b = (byte)a; // This is called as explicit conversion its also called as casting

         float f = 5.6f;
         int x = (int)f ;
         System.out.println(x);
        //  Here i've converted int value to float so what it does is it removes the value after the point in this case it removed .6

        int c = 257; 
        // it works fine when the value is 12 since 12 is in the range but when it goes out of range the value is given in modulus
        byte k = (byte) c;
        System.out.println(k);

    }
    
}
