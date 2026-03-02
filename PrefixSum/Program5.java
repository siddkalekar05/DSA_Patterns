/*
Problem Statement:
------------------
Find index where left sum equals right sum.

Pattern Used:
-------------
Prefix Sum

Approach:
---------
Compute total sum.
Maintain leftSum.
RightSum = total - leftSum - arr[i].

Time Complexity: O(n)
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


