/*
Problem Statement:
Replace every element in the array with the sum
of all other elements.

Example:
Input: {1,2,3,4}
Output: {9,8,7,6}

Approach:
First calculate the total sum of the array.
Traverse the array again.
For each element replace it with totalSum - currentElement.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo11 {

    static void replace(int arr[]) {

        int sum = 0;

        for(int num : arr)
            sum += num;

        for(int i = 0; i < arr.length; i++)
            arr[i] = sum - arr[i];

        for(int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

        replace(arr);
    }
}
