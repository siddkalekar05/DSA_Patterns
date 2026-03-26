/*
Problem Statement:
Print all elements of queue.

Example:
Queue: [10,20,30]

Output:
10 20 30

Approach (Steps):
1. Traverse from front to rear
2. Print each element

Time Complexity: O(n)
Space Complexity: O(1)
*/

class QueueDisplay {

    int arr[] = {10,20,30,40};
    int front = 0;
    int rear = 3;

    void display(){

        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        QueueDisplay q = new QueueDisplay();

        q.display();
    }
}
