public class TerneryOp {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;

        // if(n%2==0)
        // {
        //     result = 10;
        // }
        // else
        // {
        //     result = 20;
        // }
        // Instead of all these if conditions we can use ternary operators

        result = n%2==0 ? 10 : 20; // Since its odd it'll print 20 
        System.out.println(result);
    }
}
