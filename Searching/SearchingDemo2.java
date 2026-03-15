/*
Problem Statement:
Given a sorted array of integers and a target value,
find the index of the target element using Binary Search.

Example:
Input:  arr = [10,20,30,40,50]
Target = 40

Output:
Element found at index 3

Approach:
Binary Search works only on sorted arrays.

Steps:
1. Set left = 0 and right = n-1
2. Find mid = (left + right) / 2
3. If arr[mid] == target → return mid
4. If arr[mid] < target → search right half
5. If arr[mid] > target → search left half

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.*;
class SearchingDemo2 {
    static int binary(int arr[] , int start, int end,int target){

        while(start<end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=mid;
            }else{
                end = mid-1;
            }
        }
        return -1;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{10,20,30,40,50};
        int start = 0;
        int end = arr.length;
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int index =  binary(arr,start,end,target);
        if(index==-1){
            System.out.println("Ele is not found");
        }else{
            System.out.println("Ele found at index : "+index);
        }
    }
    
}
