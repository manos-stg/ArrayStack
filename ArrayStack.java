public class ArrayStack implements Stack{
    public static final int CAPACITY = 100;
    private int capacity;
    private Object[] S;
    int top = -1;
    
    public ArrayStack(){
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity){
        this.capacity = capacity;
        S = new Object[capacity];
    }
    
    public int size(){
        return top+1;
    }
    
    public boolean isEmpty(){
        return(top<0);
    }
    
    public boolean isFull(){
        return(top==capacity-1);
    }
    
    public Object top(){
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        return S[top];
    }
    
    public void push(Object item){
        if(isFull())
            throw new StackFullException("Stack overflow");
        S[++top] = item;
    }
    
    public Object pop(){
        if(isEmpty())
            throw new StackEmptyException("Stack underflow");
        Object item = S[top];
        S[top--] = null;
        return item;
    }
}
