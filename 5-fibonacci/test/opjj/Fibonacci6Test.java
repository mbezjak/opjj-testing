package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci6Test {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0", 0, Fibonacci6.calc(0));
        assertEquals("f(1) == 1", 1, Fibonacci6.calc(1));
        assertEquals("f(2) == 1", 1, Fibonacci6.calc(2));
        assertEquals("f(3) == 2", 2, Fibonacci6.calc(3));
        assertEquals("f(4) == 3", 3, Fibonacci6.calc(4));
    }

}
