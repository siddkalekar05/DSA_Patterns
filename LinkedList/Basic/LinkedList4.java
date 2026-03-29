class InsertBegin {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node insert(Node head, int x){

        Node newNode = new Node(x);

        newNode.next = head;

        return newNode;
    }

    public static void main(String[] args){

        Node head = new Node(20);
        head.next = new Node(30);

        head = insert(head,10);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}