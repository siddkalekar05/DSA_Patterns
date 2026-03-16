/*
Problem Statement:
Sort an array using Bubble Sort.

Example:
Input:  [5,3,8,4,2]
Output: [2,3,4,5,8]

Approach:
Bubble Sort repeatedly swaps adjacent elements
if they are in the wrong order.

Steps:
1. Traverse the array multiple times.
2. Compare adjacent elements.
3. Swap if arr[j] > arr[j+1].

Largest element moves to the end in each pass.

Time Complexity:
Best Case  : O(n)
Worst Case : O(n²)

Space Complexity:
O(1)
*/

class Bubble {
    static void sort2(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2};
        sort2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
