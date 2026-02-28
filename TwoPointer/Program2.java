/*
Problem Statement:

Check whether the given array is a palindrome.
An array is palindrome if it reads the same forward and backward.

Pattern Used:

Two Pointer (Left-Right comparison)

Approach:

Compare elements from both ends.
If mismatch found, return false.
If loop completes, return true.

Time Complexity:
O(n)
*/
class TwoPointerDemo2{
    static void  pall(int arr[]){
        int start = 0;
        int end = arr.length-1;
        boolean flag = true;
        while(start<end){
            if(arr[start]!=arr[end]){
                flag = false;
                return;
            }
            start++;
            end--;
        }
        System.out.println(flag);    
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,13,14,15,14,13,12};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        pall(arr);
    }

}
