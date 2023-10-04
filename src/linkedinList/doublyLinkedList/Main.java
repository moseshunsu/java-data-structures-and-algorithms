package linkedinList.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 7);
        System.out.println(dll.head.next.value);
        dll.traversDLL();
//        dll.reverseTraverseDLL();
//        dll.searchNode(4);
//        dll.searchNode(7);
        dll.deleteNodeDLL(2);
        dll.traversDLL();
        dll.deleteDLL();
        dll.traversDLL();
    }
}
