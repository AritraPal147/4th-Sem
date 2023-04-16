// 5. Implement a Queue and its operations using Java.cls

class Queue {
    private int front;
    private int rear;
    private int size;
    private int[] data;

    public Queue(int capacity) {
        front = 0;
        rear = -1;
        size = 0;
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void enqueue(int value) {
        if (isFull()) 
            System.out.println("Queue is full");
    
        rear = (rear + 1) % data.length;
        data[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) 
            System.out.println("Queue is empty");
    
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) 
            System.out.println("Queue is empty");
        return data[front];
    }
}


public class Q5_Queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek()); // Output: 2

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue()); // Output: 2
        System.out.println(queue.dequeue()); // Output: 3
        System.out.println(queue.dequeue()); // Output: 4

        System.out.println(queue.isEmpty()); // Output: false
    }
}
