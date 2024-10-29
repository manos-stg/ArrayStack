public interface Stack {
    public int size();
    public boolean isEmpty();
    public boolean isFull();
    public Object top();
    public void push(Object item);
    public Object pop();
}
