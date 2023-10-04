package linkedList.doubly.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        System.out.println(dll.head.next.value);
        dll.traverseDLL();
//        dll.reverseTraverseDLL();
//        dll.searchNode(4);
//        dll.searchNode(7);
        dll.deleteNodeDLL(2);
        dll.traverseDLL();
        dll.deleteDLL();
        dll.traverseDLL();
    }
}
