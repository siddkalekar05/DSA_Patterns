/*
Problem Statement:
Given an array of integers and a target element,
find the index of the target element using Linear Search.

Example:
Input:  arr = [10, 20, 30, 40, 50]
Target = 30

Output:
Element found at index 2

Approach:
Traverse the array from beginning to end.
Check each element with the target.
If element matches target → return index.
If no element matches → return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;

class SearchingDemo1 {
    static int search(int arr[] , int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ele for search : ");
        int ele = sc.nextInt();
        int arr[] = new int[]{7,12,34,56,9,8,4,2};
        int index = search(arr,ele);
        if(index==-1){
            System.out.println("Ele not found");
        }else{
            System.out.println("Ele found at index : "+index);
        }
    }
    
}
