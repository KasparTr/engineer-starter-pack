package util.greatestCommonDividor;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Finder {

        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        public int generalizedGCD(int num, int[] arr)
        {
            // WRITE YOUR CODE HERE
            int result = arr[0];
            for (int i = 1; i < num; i++)
                result = gcd(arr[i], result);

            return result;
        }

        /**
         * Euclids GCP
         * Calculates the greatest common divisor for two numbers.
         *
         */
        public static int gcd(int p, int q) {
            if (q == 0) {
                return p;
            }
            return gcd(q, p % q);
        }
}
