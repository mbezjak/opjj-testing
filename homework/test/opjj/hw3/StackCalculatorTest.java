package opjj.hw3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackCalculatorTest {

    private StackCalculator calc = new StackCalculator();

    @Test
    public void pushShouldAddNumberToTheStack() {
        int n = 42;
        calc.push(n);

        assertEquals(n, calc.result());
        assertEquals(1, calc.size());
    }

    @Test(expected = IllegalStateException.class)
    public void addShouldThrowExceptionOnNoOperands() {
        calc.add();
    }

    @Test(expected = IllegalStateException.class)
    public void addShouldThrowExceptionOnOnlyOneOperand() {
        calc.push(42).add();
    }

    @Test
    public void addShouldAddTwoOperandsAndPushResultOnTheStack() {
        int a = 1;
        int b = 5;
        calc.push(a).push(b).add();

        assertEquals(b + a, calc.result());
        assertEquals(1, calc.size());
    }

    @Test
    public void resultShouldReturn0OnEmptyStack() {
        assertEquals(0, calc.result());
    }

}
