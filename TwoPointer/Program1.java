/*
Problem Statement:
------------------
Given an integer array, reverse the array in-place without using extra space.

Pattern Used:
-------------
Two Pointer (Left-Right inward movement)

Approach:
---------
Use two pointers:
- left starting from index 0
- right starting from last index
Swap elements at both positions and move pointers inward.

Algorithm:
----------
1. Initialize left = 0 and right = n - 1.
2. While left < right:
   - Swap arr[left] and arr[right].
   - Increment left.
   - Decrement right.
3. End loop.

Time Complexity:
----------------
O(n)

Space Complexity:
-----------------
O(1)

Edge Cases:
-----------
- Empty array
- Single element array
- All elements same
*/
class TwoPointerDemo1{
    static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,13,14,15,16,17};
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
        
    }

}
