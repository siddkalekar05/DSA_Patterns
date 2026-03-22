import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack2 {
    Node top = null;

    void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    boolean empty() {
        return top == null;
    }

    void printStack() {
        if (empty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        while (temp != null) {   
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class StackDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack2 st = new Stack2();
        char ch;

        do {
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Empty ?");
            System.out.println("5.Print");
            System.out.print("Enter your choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter data : ");
                    int data = sc.nextInt();
                    st.push(data);   
                    break;
                }
                case 2: {
                    int value = st.pop();
                    if (value != -1)
                        System.out.println("Removed : " + value);
                    break;
                }
                case 3: {
                    int peek = st.peek();
                    if (peek != -1)
                        System.out.println("Top element : " + peek);
                    break;
                }
                case 4: {
                    System.out.println("Stack is empty ? " + st.empty());
                    break;
                }
                case 5: {
                    System.out.println("Stack elements:");
                    st.printStack();
                    break;
                }
                default:
                    System.out.println("Enter valid choice");
            }

            System.out.print("Continue? (y/n): ");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
    }
}