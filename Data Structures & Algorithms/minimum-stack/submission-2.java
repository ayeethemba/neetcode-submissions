class MinStack {
    private int size;
    private List<Integer> container;
    private Stack<Integer> minStack;
    

    public MinStack() {
        size = 0;
        container = new ArrayList<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        container.add(val);
        if (minStack.size() == 0) {
            minStack.push(val);
        }
        else {
            minStack.push(Math.min(val, minStack.peek()));
        }
       
        size++;
    }
    
    public void pop() {
        container.remove(size - 1);
        minStack.pop();
        size--;
    }
    
    public int top() {
        return container.get(size - 1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
