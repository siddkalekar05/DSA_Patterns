/*
Problem Statement:
Sort an array using Quick Sort.

Example:
Input : [8,3,1,7,0,10,2]
Output: [0,1,2,3,7,8,10]

Approach:
Quick Sort selects a pivot element.

Steps:
1. Choose pivot (last element).
2. Place pivot in correct position.
3. Recursively sort left and right subarrays.

Time Complexity:
Average: O(n log n)
Worst : O(n²)

Space Complexity: O(log n)
*/

class QuickSort {
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j < high; j++) {

            if(arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    static void quickSort(int arr[], int low, int high) {

        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {8,3,1,7,0,10,2};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for(int num : arr)
            System.out.print(num + " ");
    }
}
