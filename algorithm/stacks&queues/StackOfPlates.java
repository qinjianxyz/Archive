import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackOfPlates {
    ArrayList<Stack> stacks = new ArrayList<>();

    public void push(int value) {
        Stack last = getLastStack();
        if (last != null && !last.isFull()) {
            last.push(value);
        } else {
            Stack stack = new Stack(capacity);
            stack.push(value);
            Stacks.add(stack);
        }
    }

    public int pop() {
        Stack<E> last = getLastStack();
        if (last == null)
            throw new EmptyStackException();
        int value = last.pop();
        if (last.size() == 0)
            stacks.remove(last.size() - 1);
        return value;
    }
}
