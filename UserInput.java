import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creating scanner
        
        System.out.println("Enter your Name : ");
        String name = sc.nextLine(); // This is used for string input

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Hello!! " + name + " you are " + age + " years old!!");

        sc.close(); // Always close the scanner

        // you can also use sc.nextDouble() whose size is 8byte or 64 bits
        // and you could also use nextBoolean() for tru and false answers
    }
}
