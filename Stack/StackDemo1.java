/*
         * Problem:
         * Store elements in a stack and print all elements using iteration.
         *
         * Approach:
         * 1. Create a Stack of Integer type.
         * 2. Push elements into the stack using push().
         * 3. Use enhanced for-loop (for-each) to traverse the stack.
         *    - Note: Stack internally extends Vector, so it supports iteration.
         * 4. Print each element.
         *
         * Time Complexity (TC):
         * - push() operation: O(1) each
         * - Iteration over n elements: O(n)
         * - Overall TC: O(n)
         *
         * Space Complexity (SC):
         * - Stack stores n elements → O(n)
         */

import java.util.*;
class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        for(int data : s){
            System.out.println(data);
        }
    }
    
}
