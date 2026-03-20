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