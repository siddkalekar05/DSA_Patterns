/*
Problem Statement:
Print all elements in stack.

Approach:
Traverse from top to 0.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class StackDisplay {

    int arr[] = {10,20,30,40};
    int top = 3;

    void display(){

        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        StackDisplay s = new StackDisplay();

        s.display();
    }
}
