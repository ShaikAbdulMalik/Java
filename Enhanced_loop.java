import Basics.Student;

class Student
{
    int rollno;
    int marks;
    String name;
}
public class Enhanced_loop {
    public static void main(String[] args) {
      
        // int nums[] = new int[5];
        // nums[0] = 2;
        // nums[1] = 6;
        // nums[2] = 0;
        // nums[3] = 1;

        // for(int i = 0; i< nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }
        
        // This is enhanced loop also called as for each loop it is used to simplify the coding and looping process and make it clutter free
        
        // for(int n: nums) 
        // {
        //     System.out.print(n);
        // }

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

        for(Student s : students)
        {
            System.out.println(s.name + " : " + s.marks);
        }
    }    
}
