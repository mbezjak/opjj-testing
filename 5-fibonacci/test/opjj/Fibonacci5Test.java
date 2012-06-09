package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci5Test {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0", 0, Fibonacci5.calc(0));
        assertEquals("f(1) == 1", 1, Fibonacci5.calc(1));
        assertEquals("f(2) == 1", 1, Fibonacci5.calc(2));
        assertEquals("f(3) == 2", 2, Fibonacci5.calc(3));
    }

}
