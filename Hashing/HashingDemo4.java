/*
Problem Statement:
Return true if array contains duplicate values.

Time Complexity: O(n)
Space Complexity: O(n)
*/


import java.util.*;

class ContainsDuplicate {

    static boolean check(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            if(set.contains(num))
                return true;

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,4,1};

        System.out.println(check(arr));
    }

}
