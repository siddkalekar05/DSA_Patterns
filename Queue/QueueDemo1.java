/*
Problem Statement:
Insert elements into a queue.

Example:
Insert: 10, 20, 30

Approach (Steps):
1. Initialize rear = -1
2. Increment rear
3. Insert element at arr[rear]

Time Complexity: O(1)
Space Complexity: O(n)
*/

class EnqueueDemo {

    int arr[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){

        rear++;              
        arr[rear] = x;   
    }

    public static void main(String[] args){

        EnqueueDemo q = new EnqueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Rear element: " + q.arr[q.rear]);
    }
}
