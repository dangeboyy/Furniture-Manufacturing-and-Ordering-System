package Factory;

public interface IStack<T> {
    public void push(T pushedElement);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public boolean isFull();
}
