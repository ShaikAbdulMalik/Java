import pack.*;

// if you want to import single files you could specify the entire path well in this case its pack.packA but if you want to import all the files in the package you would need to add a star as shown above
public class Pack {
    public static void main(String[] args) {
        // packA a = new packA(); //if i dont import the packages from the other folder it won't run since packA is now in an other folder then the main Pack hence i would need to import the package from the 'pack' package folder

        packA a = new packA();
        packB b = new packB();
    }
}
