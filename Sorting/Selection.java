/*
Problem Statement:
Sort an array using Selection Sort.

Example:
Input: [5,3,8,4,2]
Output: [2,3,4,5,8]

Approach:
1. Find the smallest element.
2. Swap it with the first element.
3. Repeat for remaining array.

Time Complexity:
O(n²)

Space Complexity:
O(1)
*/

class Selection{
    static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
