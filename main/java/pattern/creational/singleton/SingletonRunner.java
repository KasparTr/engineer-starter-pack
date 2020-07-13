package pattern.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        //Get the only object available
        TokenProvider tokenProvider = TokenProvider.getInstance();
        System.out.println("(before)TokenProvider instance ID: " + System.identityHashCode(tokenProvider) );
        String token = tokenProvider.generateToken();
        System.out.println("(before)token: " + token);

        tokenProvider = TokenProvider.getInstance();
        System.out.println("(after) TokenProvider instance ID: " + System.identityHashCode(tokenProvider) );
        token = tokenProvider.generateToken();
        System.out.println("(after)token: " + token);

    }
}
