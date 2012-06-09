package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci2Test {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0", 0, Fibonacci2.calc(0));
    }

}
