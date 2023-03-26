package Factory;

public class Warehouse<T> implements IStack<T> {
    private int wcount=0;
    private int cusCount=0;

    public int getCusCount() {
        return cusCount;
    }

    public void setCusCount(int cusCount) {
        this.cusCount = cusCount;
    }

    private int size;
    private T warehouse[];

    public int getWcount() {
        return wcount;
    }

    public void setWcount(int wcount) {
        this.wcount = wcount;
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public T[] getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(T[] warehouse) {
        this.warehouse = warehouse;
    }

    public int getTop_stack() {
        return top_stack;
    }

    public void setTop_stack(int top_stack) {
        this.top_stack = top_stack;
    }

    private int top_stack;
    public Warehouse(int size) {
        super();
        this.size = size;
        this.warehouse = (T[]) new Object[size];
        this.top_stack = -1;
    }

    public void push(T pushedElement) {
        if (!isFull()) {
            top_stack++;
            warehouse[top_stack] = pushedElement;
            wcount++;
        } else {
            System.out.println("Stack is full !");
        }
    }

    @Override

    public T pop() {
        if (!isEmpty()) {
            T deletedItem = warehouse[top_stack];
            warehouse[top_stack]=null;
            top_stack--;
            wcount--;
            cusCount++;
            return deletedItem;
        }
        return null;
    }

    public T peek() {
        return warehouse[top_stack];
    }

    public boolean isEmpty() {
        return (top_stack == -1);
    }

    public boolean isFull() {
        return (size - 1 == top_stack);
    }






}
