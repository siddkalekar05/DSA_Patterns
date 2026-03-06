/*
Problem Statement:
Swap alternate elements of array.

Example:
Input: {1,2,3,4,5}
Output: {2,1,4,3,5}

Approach:
Traverse array with step of 2.
Swap i and i+1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class SwapAlternate {

    static void swap(int arr[]){

        for(int i=0;i<arr.length-1;i+=2){

            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for(int num:arr)
            System.out.print(num+" ");
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,4,5};

        swap(arr);
    }

}
