import java.util.*;

class Queue1 {

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        Stack<Integer> st = new Stack<>();

        // Step 1: push into stack
        while(!q.isEmpty()){
            st.push(q.remove());
        }

        // Step 2: push back to queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}