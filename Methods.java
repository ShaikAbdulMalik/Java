
class Computer
{
    public void playingMusic()
    {
        System.out.println("playing music...");
    }

    public String ConnectMouse (int port)
    {
        if(port <= 2)
            return "Mouse Connected...";
        else
            return "Wrong port";
        
    }
}

public class Methods {
    public static void main(String[] args) {
     
        Computer obj = new Computer();
        obj.playingMusic();
        String str =obj.ConnectMouse(3);
        System.out.println(str);
    }
}
