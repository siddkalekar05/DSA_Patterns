/*
Problem:
Implement a Stack using an array with the following operations:
1. push()  → Insert element
2. pop()   → Remove element
3. peek()  → View top element
4. empty() → Check if stack is empty
5. print() → Display elements

Constraints:
- Stack size is fixed
- Handle overflow and underflow conditions
*/

import java.util.*;
class Stack1{
    int maxsize;
    int top = -1;
    int stackarr[];
    Stack1(int maxsize){
        this.maxsize = maxsize;
        stackarr = new int[maxsize];
    }
    void push(int data){
        if(top==maxsize-1){
            System.out.println("Stack is overflow");
            return;
        }else{
            top++;
            stackarr[top] = data;
        }

    }
    int pop(){
        int value = stackarr[top];
        top--;
        return value;

    }
    int peek(){
        return stackarr[top];
    }
    boolean empty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    void printStack(){
        for(int i = top;i>-1;i--){
            System.out.print(stackarr[i]+" ");
        }
        System.out.println();
    }
}

class StackDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        Stack1 st = new Stack1(size);
        char ch;
        do{
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Empty ?");
            System.out.println("5.Print");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    System.out.println("Enter data : ");
                    int data  = sc.nextInt();
                    st.push(data);
                    break;
                }
                case 2:{
                    int value = st.pop();
                    System.out.println("remove : "+value);
                    break;
                }
                case 3:{
                    int peek = st.peek();
                    System.out.println("Peek ele : "+peek);
                    break;
                }
                case 4 : {
                    System.out.println("Stack is empty ? "+st.empty());
                    break;
                }
                case 5 :{
                    System.out.println("Stack ele : ");
                    st.printStack();
                    break;
                }
               
                default:
                    System.out.println("Enter valid choice ");
                    break;
            }
            System.out.println("Do you want to continue(y/any char)?");
            ch = sc.next().charAt(0);

        }while(ch=='y'||ch=='Y');
    }
    
}
