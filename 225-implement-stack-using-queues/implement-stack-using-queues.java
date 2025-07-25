class MyStack {
    Queue<Integer> queue; // this is interface
    public MyStack() {
        queue = new LinkedList<>();
    }
    // TC O(N)
    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        for(int i = 0; i<size - 1; i++){
            queue.add(queue.remove()); // remove from the front and added it back in rear
            // so the queue will be reverse 
        }
    }
    // TC O(1)
    public int pop() {
       return  queue.remove();
    }
     // TC O(1)
    public int top() {
        return queue.peek();
    }
     // TC O(1)
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();Add commentMore actions
 */