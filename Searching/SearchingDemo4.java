/*
Problem Statement:
Find the last occurrence of a target element in a sorted array.

Example:
Input:  [1,2,2,2,3,4]
Target = 2

Output:
Index = 3

Approach:
Use Binary Search.
When target found, move to right half
to find the last occurrence.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.*;
class SearchingDemo4 {
    static void occur(int arr[] , int target){
        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                if(first==-1){
                    first=i;
                }else{
                    last=i;
                }
            }
        }
        System.out.println("Last occurance : "+last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ele for search first and last occurence : ");
        int target = sc.nextInt();
        int arr[] = new int[]{1,1,2,2,2,3,4,4,4,4};
        occur(arr,target);
    }
    
}
