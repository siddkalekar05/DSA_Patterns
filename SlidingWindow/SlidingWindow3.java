/*
Problem Statement:
Find average of every subarray of size K.

Example:
Input: {1,3,2,6,-1,4,1,8,2}
K=5

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
class SlidingWindow3{
    static void window(int arr[],int k){
       double avg = 0.0;
       for(int i=0;i<k;i++){
        avg+=arr[i];
       }
       System.out.println("avg of window = "+avg/k);
       for(int i=k;i<arr.length;i++){
            avg+=arr[i];
            avg-=arr[i-k];
            System.out.println(avg/k);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,3,2,6,-1,4,1,8,2};
        System.out.println("Enter size of window : ");
        int k = sc.nextInt();
        window(arr,k);
    }
}

