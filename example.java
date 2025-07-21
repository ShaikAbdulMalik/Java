import java.util.Scanner;
class Student
{
    String name;
    int rollNo;

    public void Info()
    {
        System.out.println("My name is " + name);
        System.out.println("My Roll no is " + rollNo);
        
    }
}

public class example {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Student s = new Student();
        
        System.out.println("Enter your name : ");
        s.name  = scan.nextLine();

        System.out.println("Enter your Roll no : ");
        s.rollNo = scan.nextInt();

        s.Info();

        scan.close();

    }   
}
