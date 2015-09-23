class MyStack {
    Queue<Integer> in = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        in.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        int n = in.size();
        while(--n != 0) {
            in.add(in.remove());
        }
        in.remove();
    }

    // Get the top element.
    public int top() {
        int n = in.size();
        while(--n != 0) {
            in.add(in.remove());
        }
        int temp = in.element();
        in.add(in.remove());
        return temp;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return in.isEmpty();
    }
}