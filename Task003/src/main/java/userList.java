/*
Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
*/
public class userList {
    Node head;
    Node tail;

    public void add(int value){
        Node curNode = new Node();
        curNode.value = value;
        if(head == null){
            head = curNode;
            tail = curNode;
        } else {
            tail.next = curNode;
            curNode.previous = tail;
            tail = curNode;
        }
    }



    public class Node{
        int value;
        Node next;
        Node previous;
    }

}
