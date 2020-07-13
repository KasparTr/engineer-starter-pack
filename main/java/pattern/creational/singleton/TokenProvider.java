package pattern.creational.singleton;

import java.util.Random;

public class TokenProvider {

    private final String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String asciiLowerCase = asciiUpperCase.toLowerCase();
    private final String digits = "1234567890";
    private final String asciiChars = asciiUpperCase + asciiLowerCase + digits;
 

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

    public String generateToken(){
        return generateRandomString(40, asciiChars);
    }
    
    private String generateRandomString(int length, String seedChars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Random rand = new Random();
        while (i < length) {
            sb.append(seedChars.charAt(rand.nextInt(seedChars.length())));
            i++;
        }
        return sb.toString();
    }
}
