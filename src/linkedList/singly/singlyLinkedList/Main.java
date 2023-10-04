package linkedList.singly.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
//        System.out.println(sLL.head.value);
        sLL.insertLinkedList(6, 1);
        sLL.insertLinkedList(7, 3);
        sLL.insertLinkedList(8, 4);
        sLL.insertLinkedList(9, 0);
        sLL.traversalSinglyLinkedList();
//        sLL.searchNode(6);
//        sLL.searchNode(17);
        sLL.deleteSLL();
        sLL.traversalSinglyLinkedList();
//        System.out.println(sLL.head.next.next.value);

    }
}
