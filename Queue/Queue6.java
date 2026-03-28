/*
Problem Statement:
Interleave first half with second half.

Example:
Input: 1 2 3 4
Output: 1 3 2 4

Approach:
Split queue into halves and merge.

Time Complexity: O(n)
Space Complexity: O(n)
*/


import java.util.*;

class BinaryQueue {

    public static void main(String[] args){

        int n = 5;

        Queue<String> q = new LinkedList<>();

        q.add("1");

        for(int i=1;i<=n;i++){

            String curr = q.remove();

            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
