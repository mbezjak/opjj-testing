package opjj;

import java.util.Stack;

public final class StackCalculator {

    private final Stack<Integer> stack = new Stack<Integer>();

    public StackCalculator push(int n) {
        stack.push(n);
        return this;
    }

    public StackCalculator add() {
        if (size() < 2) {
            throw new IllegalStateException(
                    "Not enough operands; expected 2, got " + size());
        }

        Integer a = stack.pop();
        Integer b = stack.pop();
        stack.push(a + b);

        return this;
    }

    public int result() {
        return size() > 0 ? stack.peek() : 0;
    }

    public int size() {
        return stack.size();
    }

}
