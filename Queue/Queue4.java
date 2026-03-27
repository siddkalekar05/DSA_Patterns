import java.util.*;

class PalindromeQueue {

    static void check(String str){

        Queue<Character> q = new LinkedList<>();
        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray()){
            q.add(c);
            st.push(c);
        }

        while(!q.isEmpty()){

            if(q.remove() != st.pop()){
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }

    public static void main(String[] args){

        check("madam");
    }
}