
class student
{
    String name;
    int age;
    
    // here is the default constructor
    student()
    {
        age = 21;
        name = "malik";
    }
    
    //parameterized constructor here 
    student(int a, String n)
    {
        age = a;
        name = n;
    }

    void display()
    {
        System.out.println(name + " - " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
     
        student s1 = new student(20, "malik"); // consttructor is called whenever a new object is created or the 'new' keyword is used
        student s2 = new student();
        s1.display();
        s2.display();
        
    }
}
