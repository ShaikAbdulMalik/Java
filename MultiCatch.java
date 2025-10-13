public class MultiCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        
        String str = null;
        
        int nums[] = new int[5];

        try
        {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Oops...something went wrong " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay within the array limit!! "  + e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong " + e );
        }

        System.out.println(j);
        System.out.println("bye bye");
    }
}
