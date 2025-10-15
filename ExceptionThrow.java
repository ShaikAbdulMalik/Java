public class ExceptionThrow {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try
        {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("The answer should not be zero!! ");
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("Thats the default output!! " + e);
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong!!" + e);
        }
        
        System.out.println(j);
    }

}
