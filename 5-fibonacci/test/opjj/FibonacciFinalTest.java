package opjj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciFinalTest {

    @Test
    public void fibonacciOfN() {
        assertEquals("f(0) == 0",  0,  FibonacciFinal.calc(0));
        assertEquals("f(1) == 1",  1,  FibonacciFinal.calc(1));
        assertEquals("f(2) == 1",  1,  FibonacciFinal.calc(2));
        assertEquals("f(3) == 2",  2,  FibonacciFinal.calc(3));
        assertEquals("f(4) == 3",  3,  FibonacciFinal.calc(4));
        assertEquals("f(5) == 5",  5,  FibonacciFinal.calc(5));
        assertEquals("f(6) == 8",  8,  FibonacciFinal.calc(6));
        assertEquals("f(7) == 13", 13, FibonacciFinal.calc(7));
        assertEquals("f(8) == 21", 21, FibonacciFinal.calc(8));
        assertEquals("f(9) == 34", 34, FibonacciFinal.calc(9));
    }

}
