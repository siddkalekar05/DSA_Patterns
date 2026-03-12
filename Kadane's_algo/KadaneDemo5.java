/*
Problem Statement:
Find maximum circular subarray sum.

Example:
Input: [5,-3,5]
Output: 10

Explanation:
Circular subarray [5,5] gives maximum sum.

Approach:
Use Kadane's algorithm to find maximum subarray.
Circular case is handled by considering wrap-around.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class CircularSubarray {

    static int kadane(int arr[]){

        int current = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            current = Math.max(arr[i], current+arr[i]);
            max = Math.max(max,current);
        }

        return max;
    }

    public static void main(String[] args){

        int arr[]={5,-3,5};

        System.out.println(kadane(arr));
    }

}

