package linkedList.doubly.doublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();  // O(1)
        newNode.value = nodeValue;  // O(1)
        newNode.next = null;  // O(1)
        newNode.prev = null;  // O(1)
        head = newNode;  // O(1)
        tail = newNode;  // O(1)
        size = 1;  // O(1)
        return head;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Insertion Method
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();  // O(1)
        newNode.value = nodeValue;  // O(1)
        if (head == null) {  // O(1)
            createDLL(nodeValue);
            return;
        } else if (location == 0) {  // O(1)
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {  // O(1)
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {  // O(1)
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {  // O(n)
                tempNode = tempNode.next;
                index++;
            }
            newNode.next = tempNode.next;  // O(1)
            newNode.prev = tempNode;  // O(1)
            newNode.next.prev = newNode;  // O(1)
            tempNode.next = newNode;  // O(1)
        }
        size++;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Traverse DLL
    public void traverseDLL() {
        if (head == null) {  // O(1)
            System.out.println("DLL does not exist");
            return;
        }
        DoublyNode tempNode = head;  // O(1)
        int index = 0;  // O(1)
        while (index < size) {  // O(n)
            System.out.print(tempNode.value);
            if (index != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;  // O(1)
            index++;  // O(1)
        }
        System.out.println();  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Reverse Traversal
    public void reverseTraverseDLL() {
        if (head == null) {  // O(1)
            System.out.println("DLL does not exist!");
            return;
        }
        DoublyNode tempNode = tail;  // O(1)
        for (int i = 0; i < size; i++) {  // O(n)
            System.out.print(tempNode.value);
            if (i != size - 1) {  // O(1)
                System.out.print(" <- ");
            }
            tempNode = tempNode.prev;  // O(1)
        }
        System.out.println();  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Search Node
    public boolean searchNode(int nodeValue) {
        DoublyNode tempNode = head;  // O(1)
        if (head == null) {  // O(1)
            System.out.println("This List does not exist");
            return false;
        }
        for (int i = 0; i < size; i++) {  // O(n)
            if (tempNode.value == nodeValue) {
                System.out.println("The Node is found at location: " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!");  // O(1)
        return false;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Deletion Method
    public void deleteNodeDLL(int location) {
        if (head == null) {  // O(1)
            System.out.println("DLL does not exist");
            return;
        } else if (location == 0) {  // O(1)
            if (size == 1) {  // O(1)
                head = tail = null;
                size--;
                return;
            } else {  // O(1)
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {  // O(1)
            DoublyNode tempNode = tail.prev;
            if (size == 1) {  // O(1)
                head = tail = null;
                size--;
                return;
            } else {  // O(1)
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {  // O(1)
            DoublyNode tempNode = head;  // O(1)
            for (int i = 0; i < location - 1; i++) {  // O(n)
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;  // O(1)
            tempNode.next.prev = tempNode;  // O(1)
            size--;  // O(1)
        }

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Delete Entire DLL
    public void deleteDLL() {
        if (head == null) {  // O(1)
            System.out.println("DLL not found");
            return;
        }
        DoublyNode tempNode = head;  // O(1)
        for (int i = 1; i < size; i++) {  // O(n)
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = tail = null;  // O(1)
        System.out.println("The DLL has been deleted!!!");  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

}
