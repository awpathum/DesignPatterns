package Factory;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("The most wired Factory.OS");
    }
}
