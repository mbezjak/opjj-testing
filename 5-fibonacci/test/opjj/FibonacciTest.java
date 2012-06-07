package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0",  0,  Fibonacci.calc(0));
        assertEquals("f(1) == 1",  1,  Fibonacci.calc(1));
        assertEquals("f(2) == 1",  1,  Fibonacci.calc(2));
        assertEquals("f(3) == 2",  2,  Fibonacci.calc(3));
        assertEquals("f(4) == 3",  3,  Fibonacci.calc(4));
        assertEquals("f(5) == 5",  5,  Fibonacci.calc(5));
        assertEquals("f(6) == 8",  8,  Fibonacci.calc(6));
        assertEquals("f(7) == 13", 13, Fibonacci.calc(7));
        assertEquals("f(8) == 21", 21, Fibonacci.calc(8));
        assertEquals("f(9) == 34", 34, Fibonacci.calc(9));
    }

}
