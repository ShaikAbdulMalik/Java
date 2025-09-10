class Animal
{
    void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Cat meows");
    }
}
public class Dmd {
    public static void main(String[] args) {
        Animal a; //only the parent reference

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
