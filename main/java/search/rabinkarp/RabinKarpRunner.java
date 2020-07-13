package search.rabinkarp;

public class RabinKarpRunner {

    public static void main(String[] args)
    {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        RabinKarp.search(pat, txt, q);
    }
}
