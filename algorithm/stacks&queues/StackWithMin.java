public class StackWithMin extends MyStack<Integer> {
    MyStack<Integer> minStack;

    public StackWithMin() {
        this.minStack = new MyStack<Integer>();
    }

    public void push(int value) {
        if (value < this.min()) {
            this.minStack.push(value);
        }
        super.push(value);
    }

    public int pop() {
        int value = super.pop();
        if (value == min()) {
            this.minStack.pop();
        }
        return value;
    }

    public min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.peek();
        }
    }
}
