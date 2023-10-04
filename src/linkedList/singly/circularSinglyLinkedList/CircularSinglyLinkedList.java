package linkedList.singly.circularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        Node node = new Node();  // O(1)
        node.value = nodeValue;  // O(1)
        node.next = node;  // O(1)
        head = tail = node;  // O(1)
        size = 1;  // O(1)
        return node;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Insert Method CircularSinglyLinkedList
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();  // O(1)
        node.value = nodeValue;  // O(1)
        if (head == null) {  // O(1)
            createCSLL(nodeValue);
            return;
        } else if (location == 0) {  // O(1)
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {  // O(1)
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;  // O(1)
            int index = 0;  // O(1)
            while (index < location - 1) {  // O(n)
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;  // O(1)
            tempNode.next = node;  // O(1)
        }
        size++;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Traversal Method
    public void traversalCSLL() {
        if (head == null) {  // O(1)
            System.out.println("CLL does not exist");  // O(1)
            return;
        }
        Node tempNode = head;  // O(1)
        for (int i = 0; i < size; i++) {  // O(n)
            System.out.print(tempNode.value);  // O(1)
            if (i != size - 1) {  // O(1)
                System.out.print(" -> ");  // O(1)
            }
            tempNode = tempNode.next;  // O(1)
        }
        System.out.println();  // O(1)
    }

    // ------- Time complexity: O(n)
    // ------- Space complexity: O(1)

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (head == null) {  // O(1)
            System.out.println("CSLL does not exists");  // O(1)
            return false;  // O(1)
        }
        Node tempNode = head;  // O(1)
        for (int i = 0; i < size; i++) {  // O(n)
            if (tempNode.value == nodeValue) {  // O(1)
                System.out.println("Found the node at the location: " + i);  // O(1)
                return true;  // O(1)
            }
            tempNode = tempNode.next;  // O(1)
        }
        return false;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Deleting a node from CSLL
    public void deletionOfNode(int location) {
        if (head == null) {  // O(1)
            System.out.println("Linked List does not exists");
            return;
        } else if (location == 0) {  // O(1)
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {  // O(1)
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {  // O(1)
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {  // O(n)
                tempNode = tempNode.next;
            }
            if (tempNode == head) {  // O(1)
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;  // O(1)
            tail = tempNode;  // O(1)
            size--;  // O(1)
        } else {
            Node tempNode = head;  // O(1)
            for (int i = 0; i < location - 1; i++) {  // O(n)
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;  // O(1)
            size--;  // O(1)

            // ------- Time complexity: O(n)
            // ------- Space complexity: O(1)
        }
    }

    // Delete Entire CSLL
    public void deleteCSLL() {
        if (head == null) {  // O(1)
            System.out.println("Linked List does not exist");
            return;
        }
        head = null;  // O(1)
        tail.next = null;  // O(1)
        tail = null;  // O(1)
        System.out.println("The CSLL has been deleted");  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }
}
