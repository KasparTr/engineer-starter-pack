package pattern.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        //Get the only object available
        TokenProvider tokenProvider = TokenProvider.getInstance();

        tokenProvider.getToken();
        System.out.println("(before)TokenProvider instance ID:" + System.identityHashCode(tokenProvider) );

        tokenProvider = TokenProvider.getInstance();
        System.out.println("(after) TokenProvider instance ID:" + System.identityHashCode(tokenProvider) );
    }
}
