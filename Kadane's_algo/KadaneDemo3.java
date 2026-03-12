/*
Problem Statement:
Find maximum subarray sum when all numbers are negative.

Example:
Input: [-5,-2,-8,-1]
Output: -1

Explanation:
The largest value among negative numbers is the answer.

Approach:
Kadane's algorithm works by comparing:
current element
or extending previous sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/
     
class KadaneExample3 {

    static void maxSum(int arr[]){

        int current = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        System.out.println("Max Sum: "+max);
    }

    public static void main(String[] args){

        int arr[]={-5,-2,-8,-1};

        maxSum(arr);
    }

}
