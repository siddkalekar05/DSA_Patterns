/*
Problem Statement:
Given prefix array and indices L, R,
return sum from L to R.

Approach:
Use formula:
If L == 0 → prefix[R]
Else → prefix[R] - prefix[L-1]

Time Complexity: O(1)

*/

import java.util.*;

class PrefixDemo2 {
    static void prefix(int arr[], Scanner sc) {

        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        System.out.println("Enter range l index: ");
        int l = sc.nextInt();

        System.out.println("Enter range r index: ");
        int r = sc.nextInt();

        int range;

        if (l == 0) {
            range = pre[r];
        } else {
            range = pre[r] - pre[l - 1];
        }
        System.out.println("Range sum between index " + l + " and " + r + " is: " + range);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 4, 7, 9, 12, 17};
        prefix(arr, sc);
    }

}

