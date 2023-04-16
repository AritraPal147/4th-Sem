// 4. Implement a Stack and its operations using Java.

class Stack {
    private int top;
    private int[] data;

    public Stack(int capacity) {
        top = -1;
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public void push(int value) {
        if (isFull()) 
            System.out.println("Stack is full");
        top++;
        data[top] = value;
    }

    public int pop() {
        if (isEmpty()) 
            System.out.println("Stack is empty");
        int value = data[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) 
            System.out.println("Stack is empty");
        return data[top];
    }
}

public class Q4_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.pop()); 
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty()); 
    }
}
