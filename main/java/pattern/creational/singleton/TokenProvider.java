package pattern.creational.singleton;

public class TokenProvider {

    private static TokenProvider instance;
    // Another option is to create during build time and return it in getInstance method() without null check.
    //private static TokenProvider instance = new TokenProvider();

    //make the constructor private so that this class cannot be
    //instantiated
    private TokenProvider(){}

    //Get the only object available
    public static TokenProvider getInstance(){
        if(instance == null) instance = new TokenProvider();
        return instance;
    }

    public void getToken(){
        System.out.println("Here is your single token");
    }
}
