/*
Problem Statement:
Perform all queue operations:
enqueue, dequeue, and peek.

Approach (Steps):
1. Insert elements using enqueue
2. Print front using peek
3. Remove element using dequeue
4. Again check front

Time Complexity: O(1) for each operation
Space Complexity: O(n)
*/

class QueueEmptyCheck {

    int front = 0;
    int rear = -1;

    void check(){

        if(front > rear)
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }

    public static void main(String[] args){

        QueueEmptyCheck q = new QueueEmptyCheck();

        q.check();
    }
}
