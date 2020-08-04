package Factory;

public class IOS implements OS{

    @Override
    public void spec() {
        System.out.println("The most secure Factory.OS");
    }
}
