/*
Problem Statement:
------------------
Given an array, build a prefix sum array where
prefix[i] = sum of elements from index 0 to i.

Pattern Used:
-------------
Prefix Sum

Approach:
---------
Store cumulative sum while traversing array.

Algorithm:
----------
1. Create prefix array.
2. prefix[0] = arr[0]
3. For i = 1 to n-1:
       prefix[i] = prefix[i-1] + arr[i]
4. Return prefix.

Time Complexity: O(n)
Space Complexity: O(n)
*/
class PrefixDemo1 {
    static void prefix(int arr[]){
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        for(int data : pre){
            System.out.print(data+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,9,12,17};
        prefix(arr);
    }
    
}

