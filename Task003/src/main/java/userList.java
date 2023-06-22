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

    public void selectAll(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.println(tempNode + " = " + tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public void revert(){
        Node tempCurrent = head;

        while(tempCurrent != null){
            if(tempCurrent.previous == null){
                head = tail;
                tail = tempCurrent;
            }
            Node next = tempCurrent.next;
            Node previous = tempCurrent.previous;

            tempCurrent.next = previous;
            tempCurrent.previous = next;

            tempCurrent = next;
        }

    }

    public class Node{
        int value;
        Node next;
        Node previous;
    }

}
