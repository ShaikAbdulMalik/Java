import java.util.Scanner;
public class BooleanInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you like me ?? ");

        Boolean likesme = sc.nextBoolean();

        if (likesme){
            System.out.println("Thank you for liking me!! ");
        }
        else{
            System.out.println("Okay, hater!!");

        sc.close();
        }
    }
}
