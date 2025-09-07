class student
{
    String name;
    int age;

    void show()
    {
        System.out.println("in side class");
    }
}
public class anonObj {
    public static void main(String[] args) {
        new student().show();
    }
}
//Used when:
// Object is needed only once.
// To reduce memory waste.
//then eligible for garbage collection