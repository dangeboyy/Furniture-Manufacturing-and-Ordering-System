package Factory;

public class FactoryLine<T> implements IQueue<T>{
    public int front;
    int rear;
    int size;
    static final int capacity=1000000;
    public T[] queue= (T[]) new Object[capacity];
    public void Queue() {
        front=0;
        rear=0;
        size=0;
    }
    public boolean isEmpty() {
        return(size==0);
    }
    public boolean isFull() {

        return(size==capacity);

    }
    public void Enqueue(T element) {
        if(isFull()) {
            System.out.println("Queue is FULL!");
        }
        else {
            rear=(rear)%capacity;
            queue[rear]=element;
            System.out.println("Marketing Analyst requesting"+" "+queue[rear]+", "+"SUCCESS"+", "+queue[rear]+" "+"manufactured");
            rear++;
            size++;

        }
    }
    public T Dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            T dequeued=queue[front];
            queue[front]=null;
            front++;
            size--;
            return dequeued;
        }
        return null;

    }
}
