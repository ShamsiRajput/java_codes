class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class CustomStackExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
 }
}
}