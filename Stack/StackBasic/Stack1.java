class StackPush {

    int arr[] = new int[5];
    int top = -1;

    void push(int x){

        top++;          
        arr[top] = x;   
    }
    public static void main(String[] args){

        StackPush s = new StackPush();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top: " + s.arr[s.top]);
    }
}
