/*
Problem Statement:
Given a string, count the total number of vowels 
(a, e, i, o, u) present in the string.

Approach:
Convert the string to lowercase to handle uppercase letters.
Traverse the string character by character.
For each character:
    - Check if it is a vowel.
    - If yes, increase the count.
Print the total vowel count at the end.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class ArrayDemo8 {
    static void vowel(String str){
        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
    public static void main(String[] args) {
        String str = "SIDDHESH";
        vowel(str);
    }
    
}

