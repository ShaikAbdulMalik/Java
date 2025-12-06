public class DuckThrow {
    static void divide() throws ArithmeticException
    {
        int result = 10/0;
    }
    public static void main(String[] args) {
        try{
            divide(); //This method ducks exception
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
