import java.util.*;

class CountUsingStack {

    static void count(String str){

        Stack<Character> st = new Stack<>();

        for(char c : str.toCharArray())
            st.push(c);

        int count = 0;

        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        System.out.println("Count: " + count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        count(str);
    }
}