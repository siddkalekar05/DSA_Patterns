/*
Problem Statement:
------------------
Given two sorted arrays, merge them into a single sorted sequence.

Pattern Used:
-------------
Two Pointer (Parallel Traversal)

Approach:
---------
Use two pointers to compare elements from both arrays.
Print smaller element and move that pointer.
After one finishes, print remaining elements.

Time Complexity:
----------------
O(n + m)
*/
class TwoPointerDemo7 {

    static void merge(int arr1[], int arr2[]) {
        int i = 0, j = 0, k = 0;
        int arr3[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for (int x : arr3) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7, 9};
        int arr2[] = {2, 4, 6, 8, 10};

        merge(arr1, arr2);
    }

}
