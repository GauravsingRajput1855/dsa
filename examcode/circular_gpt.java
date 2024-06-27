public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
    }

    // Enqueue operation
    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        count++;
        return true;
    }

    // Dequeue operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        count--;
        return value;
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return count == size;
    }

    // Get the current number of elements in the queue
    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.push(1);
        cq.push(2);
        cq.push(3);
        cq.push(4);
        cq.push(5);

        System.out.println("Queue is full: " + cq.isFull());

        System.out.println("Peek: " + cq.peek());

        System.out.println("Pop: " + cq.pop());
        System.out.println("Pop: " + cq.pop());

        cq.push(6);
        cq.push(7);

        System.out.println("Peek: " + cq.peek());

        while (!cq.isEmpty()) {
            System.out.println("Pop: " + cq.pop());
        }
    }
}
