/*
Problem Statement:
Reverse elements of a queue.

Example:
Input: 10 20 30
Output: 30 20 10

Approach:
Use stack:
1. Push all queue elements into stack
2. Pop from stack and enqueue back

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x){
        s1.push(x);
    }

    int dequeue(){

        if(s2.isEmpty()){

            while(!s1.isEmpty())
                s2.push(s1.pop());
        }

        return s2.pop();
    }

    public static void main(String[] args){

        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
    }
}
