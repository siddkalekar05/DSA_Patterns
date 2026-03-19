import java.util.*;
class StackDemo2 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        for(int data : s){
            System.out.print(data+" ");
        }
        System.out.println(s.peek());

        System.out.println(s.pop());

        for(int data : s){
            System.out.print(data+" ");
        }
    }
    
}
