/*
Problem Statement:
Find the front element of queue.

Example:
Queue: [10,20,30]
Output: 10

Approach (Steps):
1. Access arr[front]
2. Print the value

Time Complexity: O(1)
Space Complexity: O(1)
*/

class QueueAllOps {

    int arr[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){
        arr[++rear] = x;
    }

    void dequeue(){
        System.out.println("Removed: " + arr[front++]);
    }

    void peek(){
        System.out.println("Front: " + arr[front]);
    }

    public static void main(String[] args){

        QueueAllOps q = new QueueAllOps();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();     
        q.dequeue();  
        q.peek();     
    }
}
