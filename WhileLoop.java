public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        // while (i <= 5) {
        //     System.out.println("hello " + i);
        //     i++;
        // }
        // System.out.println("Bye " + i); //Since this is declared outside the loop its take the next value of 'i'

        // you can understand this better by looking this up in the debugger mode and a break point to the while loop and seeing how each step takes place in this process

    // Here is an example for nested loop
        
        while(i <= 5)
            {
                System.out.println("Shaik " + i);
                int j = 1;
                while(j <= 3)
                {
                    System.out.println(" Malik " + j);
                    j++;
                }
            i++;
            }
    }
}
