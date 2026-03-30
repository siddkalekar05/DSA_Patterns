/*
Problem Statement:
Create a single node in linked list.

Approach:
Define Node class with data and next.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class NodeExample {

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

        System.out.println(n1.data);
    }
}
