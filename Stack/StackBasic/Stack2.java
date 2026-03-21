/*
Problem Statement:
Remove top element from stack.

Approach:
Print top element and decrease top.

Time Complexity: O(1)
Space Complexity: O(1)
*/

class StackPop {

    int arr[] = {10,20,30};
    int top = 2;

    void pop(){

        System.out.println("Removed: " + arr[top]);
        top--;
    }

    public static void main(String[] args){

        StackPop s = new StackPop();

        s.pop();
    }
}
