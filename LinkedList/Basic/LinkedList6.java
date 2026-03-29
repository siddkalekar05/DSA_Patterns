class CountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static void count(Node head){

        int count = 0;

        while(head != null){
            count++;
            head = head.next;
        }

        System.out.println("Total Nodes: " + count);
    }

    public static void main(String[] args){

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        count(head);
    }
}