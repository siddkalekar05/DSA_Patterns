/*
Problem Statement:
Implement two stacks using a single array.
One stack grows from left → right
Other grows from right → left

Approach:
Use two pointers:
top1 → starts from -1
top2 → starts from size

Insert:
Stack1 → left side
Stack2 → right side

Time Complexity: O(1)
Space Complexity: O(n)
*/

import java.util.*;

class StackDemo8 {
    int maxsize;
    int top1;
    int top2;
    int stackarr[];

    StackDemo8(int maxsize) {
        this.maxsize = maxsize;
        stackarr = new int[maxsize];
        top1 = -1;
        top2 = maxsize;
    }

    void push1(int data) {
        if (top1 < top2 - 1) {
            stackarr[++top1] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    void push2(int data) {
        if (top1 < top2 - 1) {
            stackarr[--top2] = data; 
        } else {
            System.out.println("Stack Overflow");
        }
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("Stack1 Underflow");
            return -1;
        }
        return stackarr[top1--];
    }

    int pop2() {
        if (top2 == maxsize) {
            System.out.println("Stack2 Underflow");
            return -1;
        }
        return stackarr[top2++];
    }

    void print() {
        System.out.print("Array: ");
        for (int i = 0; i < maxsize; i++) {
            System.out.print(stackarr[i] + " ");
        }
        System.out.println();
    }
}

class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int size = sc.nextInt();

        StackDemo8 st = new StackDemo8(size);
        char ch;

        do {
            System.out.println("\nSelect choice:");
            System.out.println("1.Push1");
            System.out.println("2.Push2");
            System.out.println("3.Pop1");
            System.out.println("4.Pop2");
            System.out.println("5.Print");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data:");
                    st.push1(sc.nextInt());
                    break;

                case 2:
                    System.out.println("Enter data:");
                    st.push2(sc.nextInt());
                    break;

                case 3:
                    int val1 = st.pop1();
                    if (val1 != -1)
                        System.out.println("Data1 pop: " + val1);
                    break;

                case 4:
                    int val2 = st.pop2();
                    if (val2 != -1)
                        System.out.println("Data2 pop: " + val2);
                    break;

                case 5:
                    st.print();
                    break;

                default:
                    System.out.println("Enter valid choice");
            }

            System.out.println("Continue? (y/n)");
            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}
