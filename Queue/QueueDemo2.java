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

class DequeueDemo {

    int arr[] = {10,20,30};
    int front = 0;
    int rear = 2;

    void dequeue(){

        System.out.println("Removed: " + arr[front]);
        front++; 
    }

    public static void main(String[] args){

        DequeueDemo q = new DequeueDemo();

        q.dequeue();
    }
}
