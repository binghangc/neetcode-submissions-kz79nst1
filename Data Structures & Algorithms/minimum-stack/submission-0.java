class MinStack {
    private int minVal;
    private int size;
    private ArrayList<int[]> stack;

    public MinStack() {
        this.minVal = Integer.MAX_VALUE;
        this.size = 0;
        this.stack = new ArrayList<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            minVal = val;
        } else {
            minVal = Math.min(minVal, val);
        }
        stack.add(new int[]{val, minVal});
        size++;
    }

    public void pop() {
        if (size == 0) return;
        stack.remove(size - 1);
        size--;
        minVal = (size == 0) ? Integer.MAX_VALUE : stack.get(size - 1)[1];
    }

    public int top() {
        return stack.get(size - 1)[0];
    }

    public int getMin() {
        return stack.get(size - 1)[1];
    }
}
