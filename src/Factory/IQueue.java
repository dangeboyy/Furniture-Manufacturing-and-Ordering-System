package Factory;

public interface IQueue<T> {
    public boolean isEmpty();
    public boolean isFull();
    public void Enqueue(T element);
    public T Dequeue();

}
