package Basics;
class Info
{
    int Age;
    public void Name()
    {
        System.out.println("My name is Shaik Abdul Malik ");
    } 


}

public class classesObj {
    public static void main(String[] args) {
        Info myInfo = new Info();
        myInfo.Age = 18;
        System.out.println(myInfo.Age);
        myInfo.Name();
    }
}
