/*
Problem Statement:
------------------
Find total sum of array elements.

Pattern Used:
-------------
Running Sum (Prefix Base)

Approach:
---------
Traverse array and accumulate sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class TotalSum {
    public static int sum(int[] arr) {
        int total = 0;
        for(int num : arr) {
            total += num;
        }
        return total;
    }
}

class PrefixDemo3 {
    static void prefix(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int data : arr){
            System.out.print(data+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,9,12,17};
        prefix(arr);
    }
    
}

