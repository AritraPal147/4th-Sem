class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (top == maxSize - 1) {
            throw new StackOverflowException("Stack is full");
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty");
        }
        int value = stackArray[top];
        top--;
        return value;
    }
}

public class Q8_StackException {
    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        try {
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);

            System.out.println("Popped value: " + myStack.pop());
            System.out.println("Popped value: " + myStack.pop());
        } catch (StackOverflowException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StackUnderflowException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

