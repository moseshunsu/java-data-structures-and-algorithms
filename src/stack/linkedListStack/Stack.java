package stack.linkedListStack;

public class Stack {
    SinglyLinkedList linkedList;

    public Stack() {
        linkedList = new SinglyLinkedList();
    }

    // Push method
    public void push(int value) {
        linkedList.insertLinkedList(value, 0);  // O(1)
        System.out.println("Inserted " + value + " in Stack");  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // isEmpty
    public boolean isEmpty() {
        return linkedList.head == null;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Pop method
    public int pop() {
        int result = -1;  // O(1)
        if (isEmpty()) {  // O(1)
            System.out.println("The Stack is Empty!");  // O(1)
        } else {
            result = linkedList.head.value;  // O(1)
            linkedList.deletionOfNode(0);  // O(1)
        }
        return result;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {  // O(1)
            System.out.println("The Stack is Empty!");  // O(1)
            return -1;
        } else {
            return linkedList.head.value;  // O(1)
        }

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Delete Method
    public void deleteStack() {
        linkedList.head = null;  // O(1)
        System.out.println("The Stack is deleted");  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }
}
