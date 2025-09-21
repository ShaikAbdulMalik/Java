public class ExceptionHan {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try
        {
            j = 18/i; //This throws an arithematic error and does not work so it moves onto catch statement 
        }
        catch(Exception e)
        {
            System.out.println("Oops...something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye bye");
    }
}
