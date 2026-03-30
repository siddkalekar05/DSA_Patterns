/*
Create linked list manually: 10 → 20 → 30
*/

class CreateList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1.data + " -> " + n1.next.data);
    }
}
