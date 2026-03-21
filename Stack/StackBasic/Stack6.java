/*
Problem Statement:
Perform all stack operations together.

Approach:
Combine push, pop and peek.

Time Complexity: O(1)
Space Complexity: O(n)
*/

class StackAllOps {

    int arr[] = new int[5];
    int top = -1;

    void push(int x){
        arr[++top] = x;
    }

    void pop(){
        System.out.println("Removed: " + arr[top--]);
    }

    void peek(){
        System.out.println("Top: " + arr[top]);
    }

    public static void main(String[] args){

        StackAllOps s = new StackAllOps();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek(); // 30

        s.pop();  // remove 30

        s.peek(); // 20
    }
}
