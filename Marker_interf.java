import java.io.*;

class Student implements Serializable
{
    int RollNo;
    String Name;

    Student(int RollNo, String Name)
    {
        this.RollNo = RollNo;
        this.Name = Name;
    }
}
public class Marker_interf {
    public static void main(String[] args) throws Exception 
    {
        Student s = new Student(1, "Malik");
        //Serialization

        FileOutputStream fos = new FileOutputStream("Student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);
        oos.close();
    }
}
