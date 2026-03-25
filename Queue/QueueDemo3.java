class PeekDemo {

    int arr[] = {10,20,30};
    int front = 0;

    void peek(){

        System.out.println("Front element: " + arr[front]);
    }

    public static void main(String[] args){

        PeekDemo q = new PeekDemo();

        q.peek();
    }
}