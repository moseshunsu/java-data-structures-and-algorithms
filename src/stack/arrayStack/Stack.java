package stack.arrayStack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];   // 0(1)
        this.topOfStack = -1;   // 0(1)
        System.out.println("The Stack is created with size of: " + size);   // 0(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(N)
    }

    // isEmpty
    public boolean isEmpty() {
        return topOfStack == -1;   // 0(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {   // 0(1)
            System.out.println("The Stack is full!");
            return true;   // 0(1)
        } else return false;   // 0(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Push
    public void push(int value) {
        if (isFull()) {   // 0(1)
            System.out.println("The Stack is full!");
        } else {
            arr[topOfStack + 1] = value;   // 0(1)
            topOfStack++;   // 0(1)
            System.out.println("The value is successfully inserted!");   // 0(1)
        }

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Pop
    public int pop() {
        if (isEmpty()) {   // 0(1)
            System.out.println("The Stack is empty!");
            return -1;
        } else {
            int topStack = arr[topOfStack];   // 0(1)
            topOfStack--;   // 0(1)
            return topStack;   // 0(1)
        }

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Peek
    public int peek() {
        if (isEmpty()) {   // 0(1)
            System.out.println("The Stack is empty!");
            return -1;
        } else return arr[topOfStack];   // 0(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Delete method
    public void deleteStack() {
        arr = null;   // 0(1)
        System.out.println("The Stack is successfully deleted");   // 0(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }
}
