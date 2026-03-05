/*
Problem Statement:
Count the number of elements in the array
that are greater than the average of the array.

Example:
Input: {1,2,3,4,5}
Output: 2

Approach:
First calculate the sum of the array.
Find the average by dividing sum by length.
Traverse again and count elements greater than average.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo13 {

    static void countGreater(int arr[]) {

        int sum = 0;

        for(int num : arr)
            sum += num;

        double avg = sum / arr.length;

        int count = 0;

        for(int num : arr) {

            if(num > avg)
                count++;
        }

        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        countGreater(arr);
    }
}
