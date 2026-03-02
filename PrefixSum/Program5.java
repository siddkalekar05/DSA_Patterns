
/*
Problem Statement:
Count number of subarrays with sum equal to target.

Approach:
Generate all subarrays.
Count matching sums.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.*;
class PrefixDemo5 {
    static boolean prefix(int arr[],Scanner sc){
        System.out.println("Enter target sum : ");
        int target = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == target)
                    return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,4,7,9,12,17};
        System.out.println(prefix(arr,sc));
    }
    
}




