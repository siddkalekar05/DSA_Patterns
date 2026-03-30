/*
Insert element at end of linked list
*/

class InsertEnd {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node insertEnd(Node head, int x){

        Node newNode = new Node(x);

        if(head == null)
            return newNode;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static void main(String[] args){

        Node head = new Node(10);
        head.next = new Node(20);

        head = insertEnd(head,30);

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
