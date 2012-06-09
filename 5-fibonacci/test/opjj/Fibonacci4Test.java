package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci4Test {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0", 0, Fibonacci4.calc(0));
        assertEquals("f(1) == 1", 1, Fibonacci4.calc(1));
        assertEquals("f(2) == 1", 1, Fibonacci4.calc(2));
    }

}
