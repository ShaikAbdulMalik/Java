class Student
{
    int rollno;
    String name;
    int marks;
}
public class arrs_of_obj {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.marks = 50;
        s1.name = "Malik";
        
        Student s2 = new Student();
        s2.rollno = 2;
        s2.marks = 34;
        s2.name = "Amaan";
        
        Student s3 = new Student();
        s3.rollno = 3;
        s3.marks = 44;
        s3.name = "Zaid";

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
