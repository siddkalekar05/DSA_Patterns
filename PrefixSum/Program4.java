/*
Problem Statement:
Check if any subarray has sum equal to target.

Approach:
Use two loops to generate subarrays.
Keep running sum.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class PrefixDemo4 {
    static void prefix(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
        System.out.println("Total sum of array : "+sum);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,9,12,17};
        prefix(arr);
    }
    
}


