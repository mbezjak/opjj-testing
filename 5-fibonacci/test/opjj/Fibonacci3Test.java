package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fibonacci3Test {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0", 0, Fibonacci3.calc(0));
        assertEquals("f(1) == 1", 1, Fibonacci3.calc(1));
    }

}
