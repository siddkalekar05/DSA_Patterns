/*
Problem Statement:

Given a sorted array and a target value,
determine if there exists a pair whose sum equals the target.
print that pairs.

Pattern Used:

Two Pointer (Inward movement on sorted array)

Approach:
Use left and right pointers.
Adjust pointers based on comparison with target.

Time Complexity:

O(n)

*/
class TwoPointerDemo7 {

    public static void sum(int arr[]) {

        int target = 16;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println("Pair found at index: " + start + " and " + end);
                start++;
                end--;
            }
            else if (sum < target) {
                start++; 
            }
            else {
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 7, 9, 12, 13};
        sum(arr);
    }

}
