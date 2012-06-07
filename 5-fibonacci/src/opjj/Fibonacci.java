package opjj;

/**
 * Very crude but familiar implementation of Fibonacci sequence in order to
 * demostrate TDD.
 * 
 * @author Miro Bezjak
 */
public class Fibonacci {

    /**
     * Assumes:
     * <ul>
     * <li><code>n</code> is non-negative
     * <li><code>n</code> is small enough to avoid result overflow
     * <li>performance is not an issue
     * </ul>
     */
    public static int calc(int n) {
        if (n <= 1)
            return n;

        return calc(n - 1) + calc(n - 2);
    }

}
