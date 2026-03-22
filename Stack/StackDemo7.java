/*
Problem:
Given an integer, reverse its digits using a Stack.

Example:
Input: 456
Output: 654
*/

import java.util.*;

class ReverseNumber3 {

    static int reverse1(int num){

        Stack<Integer> st = new Stack<>();

        if(num == 0) return 0;
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++){
            st.push(str.charAt(i) - '0');
        }

        int rev = 0;

        while(!st.isEmpty()){
            rev = rev * 10 + st.pop();
        }

        return rev;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num : ");
        int num = sc.nextInt();

        int result = reverse1(num);
        System.out.println("Reversed: " + result);
    }
}
