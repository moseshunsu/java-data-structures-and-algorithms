package linkedList.singly.singlyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public  int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();  // O(1)
        Node node = new Node();  // O(1)
        node.next = null;  // O(1)
        node.value = nodeValue;  // O(1)
        head = node;  // O(1)
        tail = node;  // O(1)
        size = 1;  // O(1)
        return head;  // O(1)

        // ------- Time complexity: O(1)
        // ------- Space complexity: O(1)
    }

    // Insert Method SinglyLinkedList
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();  // O(1)
        node.value = nodeValue;  // O(1)
        if (head == null) {
            createSinglyLinkedList(nodeValue);  // O(1)
            return;
        } else if (location == 0) {
            node.next = head;  // O(1)
            head = node;  // O(1)
        } else if (location >= size) {
            node.next = null;  // O(1)
            tail.next = node;  // O(1)
            tail = node;  // O(1)
        } else {
            Node tempNode = head;  // O(1)
            int index = 0;  // O(1)
            while (index < location - 1) {  // O(n)
                tempNode = tempNode.next;  // O(1)
                index++;  // O(1)
            }
            Node nextNode = tempNode.next;  // O(1)
            tempNode.next = node;  // O(1)
            node.next = nextNode;  // O(1)
        }
        size++;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // SinglyLinkedListTraversal
    public void traversalSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");  // O(1)
        } else {
            Node tempNode = head;  // O(1)
            for (int i = 0; i < size; i++) {  // O(n)
                System.out.print(tempNode.value);  // O(1)
                if (i != size - 1) {
                    System.out.print(" -> ");  // O(1)
                }
                tempNode = tempNode.next;  // O(1)
            }
        }
        System.out.println("\n");  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Search for a node
    public boolean searchNode(int nodeValue) {
        if (head != null) {  // O(1)
            Node tempNode = head;  // O(1)
            for (int i = 0; i < size; i++) {  // O(n)
                if (tempNode.value == nodeValue) {  // O(1)
                    System.out.print("Found the node at the location: " + i + "\n");  // O(1)
                    return true;  // O(1)
                }
                tempNode = tempNode.next;  // O(1)
            }
        }
        System.out.println("Node not found!");  // O(1)
        return false;  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

    // Deleting a node from SingleLinkedList
    public void deletionOfNode(int location) {
        if (head == null) {  // O(1)
            System.out.println("The SLL does not exist");
        } else if (location == 0) {  // O(1)
            head = head.next;
            size--;
            if (size == 0) {  // O(1)
                tail = null;
            }
        } else if (location >= size) {  // O(1)
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {  // O(n)
                tempNode = tempNode.next;  // O(1)
            }
            if (tempNode == head) {  // O(1)
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;  // O(1)
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

    // Delete Entire SingleLinkedList
    public void deleteSLL() {
        head = tail = null;  // O(1)
        System.out.println("The SLL deleted successfully");  // O(1)

        // ------- Time complexity: O(n)
        // ------- Space complexity: O(1)
    }

}
