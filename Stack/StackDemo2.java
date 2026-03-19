/*
         * Problem:
         * Perform basic stack operations and observe behavior:
         * - Insert elements
         * - Traverse stack
         * - Access top element using peek()
         * - Remove top element using pop()
         * - Print updated stack
         
         * Approach:
         * 1. Create a Stack of Integer type.
         * 2. Push elements (10, 20, 30, 40).
         * 3. Traverse using for-each loop (prints in insertion order).
         * 4. Use peek() to view the top element without removing it.
         * 5. Use pop() to remove and return the top element.
         * 6. Traverse again to see updated stack.
         
         * Time Complexity (TC):
         * - push(): O(1) each
         * - peek(): O(1)
         * - pop(): O(1)
         * - Traversal: O(n)
         * - Overall TC: O(n)
         *
         * Space Complexity (SC):
         * - Stack stores n elements → O(n)
         */

import java.util.*;
class StackDemo2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        for(int data : s){
            System.out.print(data+" ");
        }
        System.out.println(s.peek());

        System.out.println(s.pop());

        for(int data : s){
            System.out.print(data+" ");
        }
    }
    
}
