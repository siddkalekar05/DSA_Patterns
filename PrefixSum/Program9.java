/*
Problem Statement:
Find the element that appears more than n/2 times
in the given array.

Example:
Input: {2,2,1,2,3}
Output: 2

Approach:
Traverse the array.
For each element count how many times it appears.
If the count is greater than n/2, it is the majority element.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class ArrayDemo10 {

    static void majority(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(arr[i] == arr[j])
                    count++;
            }

            if(count > n/2) {

                System.out.println("Majority Element : " + arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,2,1,2,3};

        majority(arr);
    }
}
