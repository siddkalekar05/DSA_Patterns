/*
Problem Statement:
Given a string, find how many times a specific 
character appears in the string.

Approach:
Take a target character as input from the user.
Initialize count = 0.
Traverse the string character by character.
If the current character matches the target,
increase the count.
Print the total occurrences at the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
class ArrayDemo9 {
    static void frequency(String str, Scanner sc){
        System.out.println("Enter char : ");
        char target = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrences of " + target + ": " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "programming";
        frequency(str,sc);
    }

}

