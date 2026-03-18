/*
Problem Statement:
Sort an array using Merge Sort.

Example:
Input : [5,2,4,7,1,3]
Output: [1,2,3,4,5,7]

Approach:
Merge Sort uses Divide and Conquer.

Steps:
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the sorted halves.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class MergeSort {
    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for(int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2) {

            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        while(i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int left, int right) {

        if(left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,2,4,7,1,3};

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for(int num : arr)
            System.out.print(num + " ");
    }
}
