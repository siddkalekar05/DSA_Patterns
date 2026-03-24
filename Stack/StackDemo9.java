/*
Problem Statement:
Check if parentheses are valid.

Example:
Input: "{[()]}"
Output: Valid

Approach:
Push opening brackets.
For closing brackets:
match with top of stack.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class StackDemo9 {

    static boolean check(String str){

        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){

            if(c == '(' || c == '{' || c == '[')
                st.push(c);

            else{

                if(st.isEmpty())
                    return false;

                char top = st.pop();

                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '['))
                    return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string of parenthesis : ");
        String str = sc.nextLine();

        System.out.println(check(str));
    }
}
