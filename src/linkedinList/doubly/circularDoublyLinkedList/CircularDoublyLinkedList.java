package linkedinList.doubly.circularDoublyLinkedList;

public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    // Create CDLL
    public DoublyNode createCDLL(int nodeValue) {
        DoublyNode newNode = new DoublyNode();  // O(1)
        newNode.value = nodeValue;  // O(1)
        head = tail = newNode;  // O(1)
        newNode.next = newNode.prev = newNode;  // O(1)
        size = 1;  // O(1)

        return head;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Insertion Method
    public void insertNode(int nodeValue, int location) {
        if (head == null) {  // O(1)
            createCDLL(nodeValue);  // O(1)
            return;
        }
        DoublyNode newNode = new DoublyNode();  // O(1)
        newNode.value = nodeValue;  // O(1)
        if (location == 0) {  // O(1)
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {  // O(1)
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {  // O(1)
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location -1) {  // O(N)
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;  // O(1)
            newNode.next = tempNode.next;  // O(1)
            newNode.next.prev = newNode;  // O(1)
            tempNode.next = newNode;  // O(1)
        }
        size++;  // O(1)

        // ------- Time complexity: O(N)
        // ------- Space complexity: O(1)
    }

    // Traverse CDLL
    public void traverseCDLL() {
        if (head == null) {  // O(1)
            System.out.println("The CDLL does not exist!!!");
            return;
        }
        DoublyNode tempNode = head;  // O(1)
        int index = 0;  // O(1)
        while (index < size) {  // O(N)
            System.out.print(tempNode.value);  // O(1)
            if (index < size -1) {  // O(1)
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;  // O(1)
            index++;  // O(1)
        }
        System.out.println();  // O(1)

        // ------- Time complexity: O(N)
        // ------- Space complexity: O(1)
    }

    // Reverse Traversal
    public void reverseTraversalCDLL() {
        if (head == null) {  // O(1)
            System.out.println("The CDLL does not exist");
            return;
        }
        DoublyNode tempNode = tail;  // O(1)
        int index = 0;  // O(1)
        while (index < size) {  // O(N)
            System.out.print(tempNode.value);
            if (index != size - 1) {  // O(1)
                System.out.print(" <- ");
            }
            tempNode = tempNode.prev;  // O(1)
            index++;  // O(1)
        }
        System.out.println();  // O(1)

        // ------- Time complexity: O(N)
        // ------- Space complexity: O(1)
    }

    // Search for a Node
    public boolean searchNode(int nodeValue) {
        if (head == null) {  // O(1)
            System.out.println("CDLL does not exist!!!");
            return false;
        }
        DoublyNode tempNode = head;  // O(1)
        int index = 0;  // O(1)
        while (index < size) {  // O(N)
            if (tempNode.value == nodeValue) {  // O(1)
                System.out.println("The Node is found at location: " + index);
                return true;
            }
            tempNode = tempNode.next;  // O(1)
            index++;  // O(1)
        }  // O(1)
        System.out.println("Node not found!!!");  // O(1)
        return false;  // O(1)

        // ------- Time complexity: O(N)
        // ------- Space complexity: O(1)
    }

    // Deletion Method
    public void deleteNodeCDLL(int location) {
        if (head == null) {  // O(1)
            System.out.println("The CDLL does not exist!!!");
            return;
        }
        DoublyNode tempNode = head;  // O(1)
        if (location == 0) {  // O(1)
            if (size == 1) {  // O(1)
                head.next = head.prev = null;
                head = tail = null;
            } else {  // O(1)
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;  // O(1)
        } else if (location >= size) {  // O(1)
            if (size == 1) {  // O(1)
                head.next = head.prev = null;
                head = tail = null;
            } else {  // O(1)
                tail.next = head;
                tail = tail.prev;
                head.prev = tail;
            }
            size--;  // O(1)
        } else {
            for (int i = 0; i < location - 1; i++) {  // O(N)
                tempNode = tempNode.next;  // O(1)
            }
            tempNode.next = tempNode.next.next;  // O(1)
            tempNode.next.prev = tempNode;  // O(1)
            size--;  // O(1)

            // ------- Time complexity: O(N)
            // ------- Space complexity: O(1)
        }
    }

    // Delete Entire CDLL
    public void deleteCDLL() {
        DoublyNode tempNode = head;  // O(1)
        for (int i = 0; i < size; i++) {  // O(N)
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;  // O(1)
        tail = null;  // O(1)
        System.out.println("The CDLL has been deleted!!!");  // O(1)

        // ------- Time complexity: O(N)
        // ------- Space complexity: O(1)
    }

}
