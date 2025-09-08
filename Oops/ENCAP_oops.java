package Oops;
class student
{
    private String Name;
    public String getName ()
    {
        return Name;
    }
    public String setName(String NewName)
    {   
        Name = NewName;
        return NewName;
    }
}
public class ENCAP_oops {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Abdul Malik");
        System.out.println("Student name : " + s1.getName());

    }
}
