/*
Problem Statement:
Remove element from front of queue.

Example:
Queue: [10,20,30]
Output: 10 removed

Approach (Steps):
1. Access element at front
2. Print/remove it
3. Increment front

Time Complexity: O(1)
Space Complexity: O(1)
*/

class PeekDemo {

    int arr[] = {10,20,30};
    int front = 0;

    void peek(){

        System.out.println("Front element: " + arr[front]);
    }

    public static void main(String[] args){

        PeekDemo q = new PeekDemo();

        q.peek();
    }
}
