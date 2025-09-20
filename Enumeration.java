enum Status
{
    Running, Waiting, Failed, Success;
}
public class Enumeration {
    public static void main(String[] args) {
        
        Status s = Status.Failed;

        switch(s)
        {
            case Running:
                System.out.println("Now Running");
                break;
            
            case Failed:
                System.out.println("Please try again");
                break;
            
            case Waiting:
                System.out.println("Please Wait!!");
                break;
            
            case Success:
                System.out.println("Done");
                break;
        }
        
        
        // if(s == Status.Failed)
        // System.out.println("Try again!");
        // else if(s == Status.Running)
        // System.out.println("All Good!!");
        // else if(s == Status.Success)
        // System.out.println("Done!!");
        // else
        // System.out.println("Please Wait");
        
        
        
        // Status[] ss = Status.values();
        
        // for(Status s : ss){
        //     System.out.println(s + " : " + s.ordinal());
        // }
        
        
        // Status s = Status.Failed;
        // System.out.println(s.ordinal());
    }
}
