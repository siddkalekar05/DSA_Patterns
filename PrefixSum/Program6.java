/*
Problem Statement:
Find index where left sum equals right sum.

Approach:
Compute total sum.
Maintain leftSum.
RightSum = total - leftSum - arr[i].

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class PivotIndex {
    public static int pivot(int[] arr) {
        int total = 0;
        for(int num : arr)
            total += num;

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(leftSum == total - leftSum - arr[i])
                return i;

            leftSum += arr[i];
        }

        return -1;
    }
}

class PrefixDemo6 {
    static void pivot(int arr[]){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
           totalsum+=arr[i];
        }
        int leftsum = 0;
        for(int i=0;i<arr.length;i++){
            if(leftsum == totalsum-leftsum-arr[i]){
                System.out.println("Pivot ele : "+i);
                return;
            }
            leftsum+=arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,7,3,6,5,6};
        pivot(arr);
    }
    
}

