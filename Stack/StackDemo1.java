import java.util.*;
class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        for(int data : s){
            System.out.println(data);
        }
    }
    
}
