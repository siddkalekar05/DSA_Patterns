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

class Queue1 {

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        Stack<Integer> st = new Stack<>();

        // Step 1: push into stack
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        // Step 2: push back to queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
