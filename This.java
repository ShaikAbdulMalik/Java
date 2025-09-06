class student
{
    private String name;
    

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

}
public class This {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setname("ABdul Malik");
        System.out.println("Sttudnet name: " + s1.getname());
    }
}
