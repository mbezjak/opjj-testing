package opjj;

public class Fibonacci6 {

    public static int calc(int n) {
        if (n <= 1)
            return n;

        return calc(n - 1) + calc(n - 2);
    }

}
