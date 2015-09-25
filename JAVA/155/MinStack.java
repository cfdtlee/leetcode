class MinStack {
    Stack<Long> stack = new Stack<Long>();
    long min;
    public void push(int x) {
        if(stack.isEmpty()) {
            min = x;
            stack.push(0L);
        }
        else {
            stack.push(x-min);
            min = min < x ? min : x;
        }
    }

    public void pop() {
        if(!stack.isEmpty()) {
            long pop = stack.pop();
            if(pop < 0) {
                min = min - pop;
            }
        }
        
    }

    public int top() {
        return (int) (stack.peek() > 0 ? stack.peek()+min : min);
    }

    public int getMin() {
        return (int)min;
    }
}
