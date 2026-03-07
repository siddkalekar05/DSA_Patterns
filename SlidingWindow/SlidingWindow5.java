/*
Problem Statement:
Count vowels in every substring of size K.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
class VowelSubstring {

    static boolean isVowel(char c){

        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static void countVowels(String str, int k){

        int count = 0;

        for(int i=0;i<k;i++)
            if(isVowel(str.charAt(i)))
                count++;

        System.out.println(count);

        for(int i=k;i<str.length();i++){

            if(isVowel(str.charAt(i)))
                count++;

            if(isVowel(str.charAt(i-k)))
                count--;

            System.out.println(count);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        countVowels(str,3);
    }

}
