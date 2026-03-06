/*
Problem Statement:
Check whether a string is palindrome.

Example:
Input: madam
Output: Palindrome

Approach:
Compare characters from start and end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
class PalindromeString {

    static void check(String str){

        int left = 0;
        int right = str.length()-1;

        boolean isPalindrome = true;

        while(left < right){

            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        check(str);
    }

}
