/*
Problem Statement:
Implement queue using two stacks.

Approach:
Use two stacks:
push → insert into stack1
pop → transfer elements to stack2

Time Complexity:
Push → O(1)
Pop → O(n)

Space Complexity: O(n)
*/

import java.util.*;

class StackUsingQueue {

    Queue<Integer> q = new LinkedList<>();

    void push(int x){

        q.add(x);

        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }

    int pop(){
        return q.remove();
    }

    public static void main(String[] args){

        StackUsingQueue s = new StackUsingQueue();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
    }
}
