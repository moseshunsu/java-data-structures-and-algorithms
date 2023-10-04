package linkedinList.circularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(3);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(5, 1);
        csll.insertCSLL(6, 8);
//        System.out.println(csll.head.value);
//        System.out.println(csll.tail.next.value);
        csll.traversalCSLL();
//        csll.searchNode(5);
//        csll.searchNode(10);
        csll.deletionOfNode(1);
        csll.traversalCSLL();
        csll.deleteCSLL();
        csll.traversalCSLL();

    }
}
