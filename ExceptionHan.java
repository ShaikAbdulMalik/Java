public class ExceptionHan {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums [] = new int[5];
        try
        {
            j = 18/i; //This throws an arithematic error and does not work so it moves onto catch statement 
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(Exception e)
        {
            System.out.println("Oops...something went wrong " + e);
        }
        System.out.println(j);
        System.out.println("Bye bye");
    }
}
