class CustomException extends Exception
{
    public CustomException(String str)
    {
        super(str);
    }
}
public class CustExcpetion {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
            {
                throw new CustomException("what is this exception man!! ");
            }
        }
        catch(CustomException e)
        {
            j = 18/1;
            System.out.println("What da?? " + e);
        }
        System.out.println(j);
    }
}
