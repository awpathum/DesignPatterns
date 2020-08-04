package Factory;

public class Main{
    public static void main(String[] args) {
        OperatingSystemFactory fac = new OperatingSystemFactory();
        OS os = fac.getInstance("Open");
        os.spec();
    }
}