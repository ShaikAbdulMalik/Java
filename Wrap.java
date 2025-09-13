public class Wrap {
    public static void main(String[] args) {
        
        int a = 10;
        Integer obj = a; //This is auto-boxing
        System.out.println("This is Wrapper boxing : " + obj);

        int b = a; //This is auto-unBoxing
        System.out.println("This is Wrapper un-boxing : " + b);

        //ParseInt - this converts Strings into int
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("The ParseInt values * 2 are : " + (num*2));

        //toString - converts Strings into int
        String s = Integer.toString(456);
        System.out.println("The String values in int are : " + s + 2);




        
    }
}
