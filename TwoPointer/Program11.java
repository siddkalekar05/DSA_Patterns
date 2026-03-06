/*
Problem Statement:
Check if two strings are equal ignoring spaces.

Example:
"hello world"
"helloworld"

Output: Equal

Approach:
Remove spaces and compare strings.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class CompareStrings {

    static void compare(String s1,String s2){

        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");

        if(s1.equals(s2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }

    public static void main(String[] args){

        compare("hello world","helloworld");
    }
} 
    


